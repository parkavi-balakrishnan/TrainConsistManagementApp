import java.util.*;

public class SafetyCheckApp {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        // Sample data (you can take input also)
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Stream + allMatch validation
        boolean isSafe = bogies.stream().allMatch(bogie ->
                !bogie.getType().equalsIgnoreCase("Cylindrical") ||
                        bogie.getCargo().equalsIgnoreCase("Petroleum")
        );

        // Output
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}