package defpackage;

import android.media.AudioAttributes;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i30 {
    public final AudioAttributes a;

    public i30(AudioAttributes audioAttributes) {
        this.a = audioAttributes;
    }

    public final int a() {
        AudioAttributes audioAttributes = this.a;
        audioAttributes.getClass();
        return audioAttributes.getContentType();
    }

    public final int b() {
        AudioAttributes audioAttributes = this.a;
        audioAttributes.getClass();
        return audioAttributes.getFlags();
    }

    public final int c() {
        AudioAttributes audioAttributes = this.a;
        audioAttributes.getClass();
        return audioAttributes.getUsage();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i30) {
            return Objects.equals(this.a, ((i30) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }
}
