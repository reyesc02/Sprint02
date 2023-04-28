package Project02;

/**
 * The PeopleType class
 *There are two types of people they are either warrior or wizard which is
 *random but base on the number generator.
 */
public enum PeopleType
{
    wizard  ("wizard"),
    warrior ("warrior"),
    healer ("healer"),
    artifact("artifact");

    private String description;

    /**
     * PeopleType Constructor
     * Takes a type as parameter and sets the description to type.
     * @param types the types of People
     */
    PeopleType (String types)
    {
        description = types;
    }

    /**
     * The getDescription function.
     * @return The description of the peopleType.
     */
    public String getDescription()
    {
        return description;
    }
}
