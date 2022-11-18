fun main(args: Array<String>) {

    // first pattern
    for (i in 1..3)
    {
        for (j in 1..i)
        {
            print("* ")
        }
        println()
    }

    //second pattern
    for (i in 1..3)
    {
        for (j in 1..i)
        {
            print(" "+ j)
        }
        println()
    }

    //third pattern
    for (i in 1..3)
    {
        for (j in 1..i)
        {
            print(" "+ i)
        }
        println()
    }
    //fourth pattern
    for (i in 65..67)
    {
        for (j in 65..i)
        {
            print(j.toChar())
        }
        println()
    }

    //fifth pattern
    for (i in 1..5)
    {
        for (j in 1..5)
        {
            if(i==1||i==5||j==1||j==5){
                print("*"+" ")
            }
            else{
            print("  ")}
        }
        println()
    }
}
