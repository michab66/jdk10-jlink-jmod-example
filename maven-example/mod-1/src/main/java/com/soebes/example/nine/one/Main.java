package com.soebes.example.nine.one;

import javafx.beans.property.SimpleStringProperty;

public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Main one from Java 9" );
        if ( args.length > 0 )
        {
            for ( String arg : args )
            {
                System.out.println( " Arg: '" + arg + "'" );
            }
        }

        SimpleStringProperty string =
                new SimpleStringProperty( "micbinz" );

        System.out.println( "property value " + string.getValue() );
    }
}
