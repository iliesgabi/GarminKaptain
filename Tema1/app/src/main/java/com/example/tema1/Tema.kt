package com.example.tema1

class Tema {
    class Blood(var systolic: Int, var diasistolic: Int) {
        fun printBloodPresure(): String {
            if (systolic < 120 && diasistolic < 80)
                return "Normal";
            else if (systolic >= 120 && systolic <= 129 && diasistolic < 80)
                return "Elevated";
            else if (systolic >= 130 && systolic <= 139 || diasistolic >= 80 && diasistolic <= 89)
                return "High blood presure - Stage 1";
            else if (systolic >= 140 && systolic < 180 || diasistolic >= 90 && diasistolic < 120)
                return "High blood presure - Stage 2";
            else
                return "Hypertensive crisis";
        }
    }

    open class Card(var sold: Double) {
        open fun pay(suma:Double): Boolean {
            if (sold >= suma) {
                this.sold -= suma;
                return true;
            } else
                return false;
        }

        fun withdrawMoney(suma: Double) {
            sold -= suma;
        }

        fun depositMoney(suma:Double){
            sold += suma;
        }
    }

    class DebitCard(sold: Double): Card(sold) {
        override fun pay(suma: Double): Boolean {
            if (this.sold > 0)
                return super.pay(suma);
            else
                return false;
        }
    }

    class CreditCard(sold:Double, var limit: Double): Card(sold) {
        override fun pay(suma: Double): Boolean {
            if (sold > limit) {
                if (sold >= suma) {
                    sold -= suma;
                    sold += suma * 0.1;
                    return true;
                } else
                    return false;
            } else
                return false;
        }
    }

    fun factorial (n: Int): Long {
        var fact: Long = 1;
        for (i in 1..n) {
            fact *= i;
        }
        return fact;
    }
}