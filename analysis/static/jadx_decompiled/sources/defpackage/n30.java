package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* loaded from: classes.dex */
public abstract class n30 {
    private static jx6 a() {
        ix6 ix6Var = new ix6(4);
        ix6Var.b(8, 7);
        int i = oaf.a;
        if (i >= 31) {
            ix6Var.b(26, 27);
        }
        if (i >= 33) {
            ix6Var.a(30);
        }
        return ix6Var.l();
    }

    public static boolean b(AudioManager audioManager, g40 g40Var) {
        AudioDeviceInfo[] devices;
        if (g40Var == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{g40Var.a};
        }
        jx6 jx6VarA = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (jx6VarA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
