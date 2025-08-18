package defpackage;

import com.my.tracker.obfuscated.t;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class wcg implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ String o;

    public /* synthetic */ wcg(t tVar, String str, String str2, long j, Runnable runnable) {
        this.a = 2;
        this.b = tVar;
        this.o = str;
        this.X = str2;
        this.Y = j;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b((Map) this.c, this.o, this.X, this.Y);
                break;
            case 1:
                this.b.a((Map) this.c, this.o, this.X, this.Y);
                break;
            default:
                this.b.a(this.o, this.X, this.Y, (Runnable) this.c);
                break;
        }
    }

    public /* synthetic */ wcg(t tVar, Map map, String str, String str2, long j, int i) {
        this.a = i;
        this.b = tVar;
        this.c = map;
        this.o = str;
        this.X = str2;
        this.Y = j;
    }
}
