package question.exe5;

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public String getSize() {
        switch (this) {
            case SMALL:
                return "small";
            case MEDIUM:
                return "medium";
            case LARGE:
                return "largest";
            case EXTRALARGE:
                return "extralarge";
            default:
                return null;
        }

    }

    public static void main(String[] args) {
        System.out.println(""+Size.SMALL.getSize());
    }
}