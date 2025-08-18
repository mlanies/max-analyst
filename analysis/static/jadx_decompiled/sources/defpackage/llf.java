package defpackage;

import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* loaded from: classes.dex */
public final class llf {
    public final boolean a;
    public final ConversationVideoTrackParticipantKey b;
    public final boolean c;

    public llf(boolean z, ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z2) {
        this.a = z;
        this.b = conversationVideoTrackParticipantKey;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llf)) {
            return false;
        }
        llf llfVar = (llf) obj;
        return this.a == llfVar.a && tpa.f(this.b, llfVar.b) && this.c == llfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoState(isEnabled=");
        sb.append(this.a);
        sb.append(", track=");
        sb.append(this.b);
        sb.append(", isSelf=");
        return au1.j(sb, this.c, ")");
    }
}
