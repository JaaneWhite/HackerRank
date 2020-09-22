import java.util.Scanner;

public class testMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startX = sc.nextInt();
        int startY = sc.nextInt();
        System.out.println();
        int toX = sc.nextInt();
        int toY = sc.nextInt();
        System.out.println();
        Robot robot = new Robot(startX, startY, Direction.LEFT);
        Move.moveRobot(robot, toX, toY);


        System.out.println(robot.getX() + " " + robot.getY() + " " + robot.getDirection());

    }
}
    
    class Move {
            public static void moveRobot(Robot robot, int toX, int toY) {
            int startX = robot.getX();
            int startY = robot.getY();
            int StepsX = toX - startX;
            int StepsY = toY - startY;
            switch (robot.getDirection()) {
                case UP:
                    if (StepsY >= 0 ) {
                        break;
                    } else {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                    break;
                case DOWN:
                    if (StepsY <= 0 ) {
                        break;
                    } else {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                    break;
                case LEFT:
                    if (StepsY >= 0 ) {
                        robot.turnRight();
                        break;
                    } else {
                        robot.turnLeft();
                    }
                    break;
                case RIGHT:
                    if (StepsY >= 0 ) {
                        robot.turnLeft();
                        break;
                    } else {
                        robot.turnRight();
                    }
                    break;
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
            switch (robot.getDirection()) {
                case UP:
                    if (StepsX >= 0) {
                        robot.turnRight();
                        break;
                    } else {
                        robot.turnLeft();
                    }
                    break;
                case DOWN:
                    if (StepsX >= 0) {
                        robot.turnLeft();
                        break;
                    } else {
                        robot.turnRight();
                    }
                    break;
            }
            while (robot.getX() != toX) {
                robot.stepForward();
                }

        }
    }
    
    enum Direction {
        UP(0, 1),
        DOWN(0, -1),
        LEFT(-1, 0),
        RIGHT(1, 0);

        private final int dx;
        private final int dy;

        Direction(int dx, int dy) {
            this.dx = dx;
            this.dy = dy;
        }

        public Direction turnLeft() {
            switch (this) {
                case UP:
                    return LEFT;
                case DOWN:
                    return RIGHT;
                case LEFT:
                    return DOWN;
                case RIGHT:
                    return UP;
                default:
                    throw new IllegalStateException();
            }
        }

        public Direction turnRight() {
            switch (this) {
                case UP:
                    return RIGHT;
                case DOWN:
                    return LEFT;
                case LEFT:
                    return UP;
                case RIGHT:
                    return DOWN;
                default:
                    throw new IllegalStateException();
            }
        }

        public int dx() {
            return dx;
        }

        public int dy() {
            return dy;
        }
    }

    class Robot {
        private int x;
        private int y;
        private Direction direction;

        public Robot(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }

        public void turnLeft() {
            direction = direction.turnLeft();
        }

        public void turnRight() {
            direction = direction.turnRight();
        }

        public void stepForward() {
            x += direction.dx();
            y += direction.dy();
        }

        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
