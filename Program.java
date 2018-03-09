/*import org.omg.CORBA.Environment;

using System;

public class Program
{
    public static void Main()
    {
        const int CourageLevelRequired = 10;	// adjust as required

        Me me = me.CurrentInstance;
        if (me == null)
        {
            Console.WriteLine("You don't appear to exist. No point in asking anyone out. Sorry.");
            Environment.Exit(-1);
        }

        boolean stillTrying = true;

        //me.SpeakCheesyPickupLine();  - no let's not do this

        while (stillTrying)
        {
            int courageLevel = me.GetCourageLevel();
            if (courageLevel < 0)
            {
                Console.WriteLine("This probably isn't going to go well. Try again later.");
                stillTrying = false;  // not really necessary
                break;
            }
            else if (courageLevel < CourageLevelRequired)
            {
                me.ComposeMyself();
                me.TakeDeepBreath();
                continue;
            }

            me.Speak("Want to get a coffee?");
            bool? response = me.ListenForResponse();
            stillTrying = false;

            if (response == true)
            {
                Console.WriteLine("Woohoo!");
                me.Speak("That's great!");
            }
            else if (response == false)
            {
                Console.WriteLine(":(");
                me.Speak("Oh. Ok. No problem.");
            }
            else
            {
                // Hmm. No response.
                // TODO: Maybe ask again soon?
            }
        }
    }
}

*/