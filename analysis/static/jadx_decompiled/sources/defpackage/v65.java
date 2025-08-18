package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class v65 implements jde {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ v65(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.jde
    public final Object get() {
        h84 h84Var;
        i84 i84Var;
        switch (this.a) {
            case 0:
                return new gd4(this.b);
            case 1:
                return new oc4(this.b, new va4());
            case 2:
                new HashMap();
                this.b.getApplicationContext();
                nc4 nc4Var = new nc4();
                new HashMap();
                new HashSet();
                new HashMap();
                return nc4Var;
            case 3:
                return new bf4(this.b, new ob6());
            case 4:
                return new oc4(this.b, new va4());
            case 5:
                return new cf4(this.b);
            case 6:
                Context context = this.b;
                ffc ffcVar = h84.n;
                synchronized (h84.class) {
                    try {
                        if (h84.t == null) {
                            ay ayVar = new ay(context, 3);
                            h84.t = new h84((Context) ayVar.o, (HashMap) ayVar.X, ayVar.c, (rhe) ayVar.Y, ayVar.b);
                        }
                        h84Var = h84.t;
                    } finally {
                    }
                }
                return h84Var;
            default:
                Context context2 = this.b;
                ffc ffcVar2 = i84.n;
                synchronized (i84.class) {
                    try {
                        if (i84.t == null) {
                            ay ayVar2 = new ay(context2, 4);
                            i84.t = new i84((Context) ayVar2.o, (HashMap) ayVar2.X, ayVar2.c, (she) ayVar2.Y, ayVar2.b);
                        }
                        i84Var = i84.t;
                    } finally {
                    }
                }
                return i84Var;
        }
    }
}
