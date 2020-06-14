package creational.builder;

public class BuilderExample {
    public static void main(String[] args) {
        // Bad example
        final Bad bad = new Bad("A String", "Another String", "A Third String", true, false);
        System.out.println(bad);

        // Better example
        final Better.Builder betterBuilder = new Better.Builder();
        betterBuilder.setAString("A String");
        betterBuilder.setAnotherString("Another String");
        betterBuilder.setAThirdString("A Third String");
        betterBuilder.setABoolean(true);
        betterBuilder.setAnotherBoolean(false);
        final Better better = betterBuilder.build();
        System.out.println(better);

        // Fluent example
        final Better betterFluent = new Better.FluentBuilder()
                .withAString("A String")
                .withAnotherString("Another String")
                .withAThirdString("A Third String")
                .withABoolean(true)
                .withAnotherBoolean(false)
                .build();
        System.out.println(betterFluent);
    }
}
