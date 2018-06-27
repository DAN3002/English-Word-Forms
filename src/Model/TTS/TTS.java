package Model.TTS;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;


public class TTS
{
    private static Voice voice;

    public TTS(String name) 
    {
        VoiceManager vm = VoiceManager.getInstance();
        
        // Set up for Voice
        voice = vm.getVoice(name);
        voice.allocate();
    }
    
    public static void say(String text, float speed)
    {
        // Set speed for voice
        voice.setRate(speed);
        System.out.println(voice.getRate());
                
        voice.speak(text);                
    }
}
