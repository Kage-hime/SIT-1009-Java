public class BackwardString implements PlayString
{

    @Override
    public StringBuilder backwardsString(String s)
    {
        StringBuilder toReverse = new StringBuilder();
        toReverse.append(s);
        toReverse.reverse();

        return toReverse;

    }
}
