package defpackage;

import org.apache.http.util.VersionInfo;

/* loaded from: classes.dex */
public final class b95 implements i95 {
    public final int b;

    public b95(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b95) && this.b == ((b95) obj).b;
    }

    public final int hashCode() {
        return au1.s(this.b);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Failed(reason=");
        switch (this.b) {
            case 1:
                str = VersionInfo.UNAVAILABLE;
                break;
            case 2:
                str = "BUSY";
                break;
            case 3:
                str = "PRIVACY";
                break;
            case 4:
                str = "FAILED";
                break;
            case 5:
                str = "CONNECTION_ERROR";
                break;
            case 6:
                str = "REMOVE_FROM_CALL";
                break;
            case 7:
                str = "REMOVE_FROM_WAITING_ROOM";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
