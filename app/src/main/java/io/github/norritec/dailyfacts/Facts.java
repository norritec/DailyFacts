package io.github.norritec.dailyfacts;

/**
 * This contains all of the facts that are currently being used by the app.
 *
 * Created by norritec on 1/15/17.
 */

public class Facts {
    String facts[] = { "The Australian Emu holds the land speed record for birds at 31 mph.",
            "The first product to have a bar code was Wrigley’s gum.",
            "Venus is the only planet that rotates clockwise.",
            "The world’s smallest mammal is the bumblebee bat of Thailand, weighing less than a penny.",
            "Humans and Dolphins are the only species that have sex for pleasure.",
            "The ant can lift 50 times its own weight.",
            "A bowling pin needs to tilt only 7.5 degrees to fall.",
            "1 in every 4 Americans has appeared on TV at some point in their lives.",
            "The study of word origins is called etymology.",
            "The shortest war in history was between Zanzibar and England in 1896. Zanzibar surrendered after 38 minutes.",
            "According to an old English system of time units, a moment is one and a half minutes.",
            "In 1855, dentist Robert Arthur was the first to use gold to fill cavities.",
            "The smallest bone in the body is the stirrup.",
            "The average mattress contains 2 million house dust mites.",
            "No other animal gives us more by-products than the pig.",
            "Mexican jumping beans jump because of a moth larva inside the bean.",
            "An electric eel produces an average of 400 volts.",
            "A myrmecologist studies ants.",
            "To crack a whip, the tip must be traveling faster than the speed of sound.",
            "Sugar was first added to chewing gum in 1869 by a dentist named William Semple.",
            "Lee Harvey Oswald’s cadaver tag sold at an auction for $6,600 in 1992.",
            "In 1980, a Las Vegas hospital suspended workers for betting on when patients would die.",
            "Thomas Edison was afraid of the dark.",
            "At the nearest point, Russia and America are less than 4 km apart.",
            "The Channel between England and France grows about 300 millimeters each year.",
            "Einstein couldn’t speak fluently when he was age nine.",
            "You’re more likely to get stung by a bee on a windy day than in any other weather.",
            "The average person laughs about 5 times a day.",
            "A sneeze zooms out of your mouth at over 600 mph.",
            "The average person is about a quarter of an inch taller at night.",
            "Mars has a volcano, Olympus Mons, which is 310-370 miles in diameter and 16 miles high.",
            "The statue “The Thinker” by Rodin is actually a portrait of the Italian poet Dante.",
            "X-ray technology has shown that there are 3 different versions of the “Mona Lisa” under the visible one.",
            "A pig’s snout is called a gruntle.",
            "The chemical pectin, found in ripe fruit, causes jam to set when cooling.",

    };

    int i = 0;

    public String nextFact() {
        i++;
        if (i >= facts.length) {
            i = 0;
        }
        return facts[i];
    }
}
