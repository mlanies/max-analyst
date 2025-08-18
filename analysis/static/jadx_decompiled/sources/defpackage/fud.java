package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.cloudmessaging.zzt;

/* loaded from: classes.dex */
public final class fud implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fud(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                j4 j4Var = (j4) this.b;
                au1.r(message.obj);
                synchronized (j4Var.a) {
                    throw null;
                }
            case 1:
                int i = message.arg1;
                vjg vjgVar = (vjg) this.b;
                synchronized (vjgVar) {
                    try {
                        ckg ckgVar = (ckg) vjgVar.X.get(i);
                        if (ckgVar == null) {
                            return true;
                        }
                        vjgVar.X.remove(i);
                        vjgVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            ckgVar.c(new zzt("Not supported by GmsCore", null));
                            return true;
                        }
                        ckgVar.a(data);
                        return true;
                    } finally {
                    }
                }
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    synchronized (((jkg) this.b).a) {
                        try {
                            rjg rjgVar = (rjg) message.obj;
                            sjg sjgVar = (sjg) ((jkg) this.b).a.get(rjgVar);
                            if (sjgVar != null && sjgVar.a.isEmpty()) {
                                if (sjgVar.c) {
                                    sjgVar.Z.c.removeMessages(1, sjgVar.X);
                                    jkg jkgVar = sjgVar.Z;
                                    jkgVar.d.b(jkgVar.b, sjgVar);
                                    sjgVar.c = false;
                                    sjgVar.b = 2;
                                }
                                ((jkg) this.b).a.remove(rjgVar);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        return false;
                    }
                    synchronized (((jkg) this.b).a) {
                        try {
                            rjg rjgVar2 = (rjg) message.obj;
                            sjg sjgVar2 = (sjg) ((jkg) this.b).a.get(rjgVar2);
                            if (sjgVar2 != null && sjgVar2.b == 3) {
                                String.valueOf(rjgVar2);
                                new Exception();
                                ComponentName componentName = sjgVar2.Y;
                                if (componentName == null) {
                                    rjgVar2.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = rjgVar2.b;
                                    fp3.n(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                sjgVar2.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
