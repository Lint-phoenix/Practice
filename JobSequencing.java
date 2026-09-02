import java.util.Arrays;

class Job {
    char id;
    int deadline;
    int profit;

    Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {
    public static void findJobSequence(Job[] jobs) {
        int n = jobs.length;

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        char[] result = new char[maxDeadline];
        boolean[] slotFilled = new boolean[maxDeadline];
        int totalProfit = 0;

        for (Job job : jobs) {
            for (int j = Math.min(maxDeadline, job.deadline) - 1; j >= 0; j--) {
                if (!slotFilled[j]) {
                    slotFilled[j] = true;
                    result[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Optimal job sequence:");
        for (int i = 0; i < maxDeadline; i++) {
            if (slotFilled[i]) {
                System.out.print(result[i] + " ");
            }
        }
        System.out.println("\nMaximum Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        Job[] jobs = {
                new Job('a', 4, 20),
                new Job('b', 1, 10),
                new Job('c', 1, 40),
                new Job('d', 1, 30),
                new Job('e', 3, 30),
                new Job('f', 2, 50)
        };

        findJobSequence(jobs);
    }
}