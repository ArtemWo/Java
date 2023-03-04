package org.example.HW27_02_23;


    class Task implements Runnable {
        public Task(int number, int start, int end) {
            this.number = number;
            this.start = start;
            this.end = end;
        }

        int number;
        int start;
        int end;
        int count = 0;

        @Override
        public void run() {

            for (int i = start; i < end; i++) {
                if (i % number == 0) count++;
            }
                System.out.println(count);
        }
    }

