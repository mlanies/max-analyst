package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class ry8 {
    public final int a;

    public static final boolean a(int i, int i2) {
        return i == i2;
    }

    public static final boolean b(int i) {
        return (i & 8192) != 0;
    }

    public static final boolean c(int i) {
        return (i & 1) != 0;
    }

    public static final boolean d(int i) {
        return ((i & 2) == 0 && (i & 4) == 0 && (i & 32) == 0 && (i & 8) == 0 && (65536 & i) == 0 && !b(i)) ? false : true;
    }

    public static String e(int i) {
        StringBuilder sb = new StringBuilder("MessageViewType(bubbleType=");
        sb.append(new ns0(2080374784 & i));
        if (c(i)) {
            sb.append(',');
            if (((-2080374786) & i) == 0) {
                sb.append("text_only");
            } else {
                sb.append("text");
            }
        }
        if ((i & 2) != 0) {
            sb.append(",photo");
        }
        if ((i & 4) != 0) {
            sb.append(",video");
        }
        if ((i & 8) != 0) {
            sb.append(",voice");
        }
        if ((i & 16) != 0) {
            sb.append(",contact");
        }
        if ((i & 32) != 0) {
            sb.append(",file");
        }
        if ((i & 64) != 0) {
            sb.append(",geo");
        }
        if ((i & 128) != 0) {
            sb.append(",sticker");
        }
        if ((i & 256) != 0) {
            sb.append(",call");
        }
        if ((i & 512) != 0) {
            sb.append(",share");
        }
        if ((i & 4096) != 0) {
            sb.append(",big_emoji");
        }
        if (a(i, 0)) {
            sb.append(",control");
        }
        if (a(i, 131072)) {
            sb.append(",widget");
        }
        if ((i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            sb.append(",reply");
        }
        if ((i & 2048) != 0) {
            sb.append(",forward");
        }
        if (b(i)) {
            sb.append(",collage");
        }
        if ((i & 16384) != 0) {
            sb.append(",lottie_sticker");
        }
        if ((i & 32768) != 0) {
            sb.append(",webm_sticker");
        }
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ry8) {
            return this.a == ((ry8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
