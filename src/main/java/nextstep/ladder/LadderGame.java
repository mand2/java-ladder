package nextstep.ladder;

import nextstep.ladder.domain.*;
import nextstep.ladder.view.InputView;
import nextstep.ladder.view.ResultView;

public class LadderGame {

    public static void main(String[] args) {
        String joinUsers = InputView.inputGameUser();

        Users users = Users.from(UserGenerator.generateUsers(joinUsers));
        int countOfUser = users.size();

        int height = InputView.inputLadderHeight();
        LadderLine ladderLine = LadderGenerator.generateLadderLine(height, countOfUser, new RightPointRandomStrategy());

        ResultView.printGameResult(users.getUsers(), ladderLine);
    }
}