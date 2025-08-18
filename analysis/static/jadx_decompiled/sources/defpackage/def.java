package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class def implements Serializable {
    public final int X;
    public final long Y;
    public final long Z;
    public final wm3 a;
    public final String b;
    public final String c;
    public final String o;
    public final int s0;
    public final List t0;

    public def(cef cefVar) {
        this.a = cefVar.a;
        this.b = cefVar.b;
        this.o = cefVar.c;
        this.c = cefVar.d;
        this.X = cefVar.e;
        this.Y = cefVar.f;
        this.s0 = cefVar.h;
        this.Z = cefVar.i;
        this.t0 = cefVar.g;
    }

    public final String toString() {
        return "VideoConference{owner=" + this.a + ", joinLink='" + this.b + "', conversationId='" + this.c + "', callName='" + this.o + "', participantsCount=" + this.X + ", startedAt=" + this.Y + ", type=" + this.s0 + ", chatId=" + this.Z + ", previewParticipantIds=" + s5c.o(this.t0) + "}";
    }
}
