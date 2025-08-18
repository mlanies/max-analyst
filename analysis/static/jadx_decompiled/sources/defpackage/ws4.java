package defpackage;

import android.content.Context;
import java.util.Map;
import org.webrtc.EglBase;

/* loaded from: classes.dex */
public final /* synthetic */ class ws4 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ws4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
        this.Y = obj5;
        this.Z = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((o23) this.b).e((ax1) this.c, (ax1) this.o, (iee) this.X, (iee) this.Y, (Map.Entry) this.Z);
                break;
            default:
                fwc fwcVar = (fwc) this.b;
                EglBase.Context context = (EglBase.Context) this.c;
                Context context2 = (Context) this.o;
                u5e u5eVar = (u5e) this.X;
                a4c a4cVar = (a4c) this.Y;
                dnc dncVar = (dnc) this.Z;
                fwcVar.getClass();
                fwcVar.o = new h26(context, context2, u5eVar, a4cVar);
                fwcVar.X = new l26(a4cVar, dncVar);
                fwcVar.Y = new z26();
                h26 h26Var = fwcVar.o;
                final l26 l26Var = fwcVar.X;
                h26Var.Z = l26Var;
                final z26 z26Var = fwcVar.Y;
                l26Var.getClass();
                final int i = 0;
                l26Var.c.c(new Runnable() { // from class: j26
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                l26Var.Z = z26Var;
                                break;
                            default:
                                l26Var.s0 = z26Var;
                                break;
                        }
                    }
                });
                final l26 l26Var2 = fwcVar.X;
                final z26 z26Var2 = fwcVar.Y;
                l26Var2.getClass();
                final int i2 = 1;
                l26Var2.c.c(new Runnable() { // from class: j26
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                l26Var2.Z = z26Var2;
                                break;
                            default:
                                l26Var2.s0 = z26Var2;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
