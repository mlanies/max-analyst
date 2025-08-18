package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;

/* loaded from: classes.dex */
public final class em5 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public Object e;
    public Object f;

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("SessionLogEvent{opcode='");
                sb.append((String) this.e);
                sb.append("', bytesSent=");
                sb.append(this.d);
                sb.append(", bytesReceived=0, responseTime=");
                sb.append(this.c);
                sb.append(", retry=false, error=");
                return au1.j(sb, this.b, "}");
            default:
                return super.toString();
        }
    }

    public em5(String str, int i, long j, boolean z, String str2) {
        this.a = 2;
        this.e = str;
        this.d = i;
        this.c = j;
        this.b = z;
        this.f = str2;
    }

    public em5(Bitmap bitmap, long j, Point point, int i, boolean z) {
        this.a = 3;
        this.e = bitmap;
        this.c = j;
        this.f = point;
        this.d = i;
        this.b = z;
    }
}
