package defpackage;

import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* loaded from: classes.dex */
public final class vl4 {
    public final ConversationVideoTrackParticipantKey a;
    public final int b;
    public final int c;

    public vl4(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, int i, int i2) {
        this.a = conversationVideoTrackParticipantKey;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl4)) {
            return false;
        }
        vl4 vl4Var = (vl4) obj;
        return tpa.f(this.a, vl4Var.a) && this.b == vl4Var.b && this.c == vl4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayLayout(track=");
        sb.append(this.a);
        sb.append(", w=");
        sb.append(this.b);
        sb.append(", h=");
        return zr6.j(sb, this.c, ")");
    }
}
