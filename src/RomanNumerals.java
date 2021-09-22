public class RomanNumerals {
    public static void main(String[] args) {
        int num = 3531;

        if (num >= 4000 || num <= 0)
        {
            System.out.println("That number exceeds the limit");
            return;
        }

        System.out.println("\n\n" + "Decimal Number:" +  num + "\n");

        String r = "";

        if (num >= 1000)
        {
            int knum = num / 1000;

            for (int i = 0; i < knum; i++)
            {
                r += "M";

                num -= 1000;
            }
            knum = 0;
        }

        if (num >= 900)
        {
            r += "CM";

            num -= 900;
        }

        if (num >= 500)
        {
            r += "D";

            num -= 500;
        }

        if (num >= 400)
        {
            r += "CD";

            num -= 400;
        }

        if (num >= 100)
        {
            int hnum = num / 100;

            for (int i = 0; i < hnum; i++)
            {
                r += "C";

                num -= 100;
            }
            hnum = 0;
        }

        if (num >= 90)
        {
            r += "XC";

            num -= 90;
        }

        if (num >= 50)
        {
            r += "L";

            num -= 50;
        }

        if (num >= 40)
        {
            r += "XL";

            num -= 40;
        }

        if (num >= 10)
        {
            int tnum = num / 10;

            for (int i = 0; i < tnum; i++)
            {
                r += "X";

                num -= 10;
            }
            tnum = 0;
        }

        if (num >= 9)
        {
            r += "IX";

            num -= 9;
        }

        if (num >= 5)
        {
            r += "V";

            num -= 5;
        }

        if (num >= 4)
        {
            r += "IV";

            num -= 4;
        }

        if (num >= 1)
        {
            for (int i = 0; i < num; i++)
            {
                r += "I";

                num -= 1;
            }
        }


        System.out.println("Roman Numeral Equivalent:" + r + "\n\n");
    }
}
