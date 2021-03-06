package me.tongfei.progressbar;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author Tongfei Chen
 */
public class ProgressBarTest {

    @Test
    public void test() {
        try (ProgressBar pb = new ProgressBar("Test", 5, 50, System.out, ProgressBarStyle.UNICODE_BLOCK, "KB", 1024)) {

            double x = 1.0;
            double y = x * x;

            ArrayList<Integer> l = new ArrayList<Integer>();

            System.out.println("\n\n\n\n\n");

            for (int i = 0; i < 10000; i++) {
                int sum = 0;
                for (int j = 0; j < i * 2000; j++)
                    sum += j;
                l.add(sum);

                pb.step();
                if (pb.getCurrent() > 8000) pb.maxHint(10000);

            }
        }
        System.out.println("Hello");
    }

}
