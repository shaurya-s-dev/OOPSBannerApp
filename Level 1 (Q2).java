class SamAverageMarks {
    public static void main(String[] args) {
        String name = "Sam";
        double mathMarks = 94;
        double physicsMarks = 95;
        double chemistryMarks = 96;
        double totalMarks = 100;
        double averageMarks = (mathMarks + physicsMarks + chemistryMarks) / 3;
        System.out.println(name + "'s average mark in PCM is " + averageMarks);
    }
}