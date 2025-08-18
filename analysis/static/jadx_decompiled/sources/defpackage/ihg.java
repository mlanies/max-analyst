package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ihg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ihg(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ogg oggVar = (ogg) this.c;
                try {
                    Task task = (Task) oggVar.c.u((Task) this.b);
                    if (task == null) {
                        oggVar.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ok4 ok4Var = xne.b;
                    task.d(ok4Var, oggVar);
                    task.c(ok4Var, oggVar);
                    task.a(ok4Var, oggVar);
                    return;
                } catch (RuntimeExecutionException e) {
                    if (e.getCause() instanceof Exception) {
                        oggVar.o.m((Exception) e.getCause());
                        return;
                    } else {
                        oggVar.o.m(e);
                        return;
                    }
                } catch (Exception e2) {
                    oggVar.o.m(e2);
                    return;
                }
            case 1:
                vjg vjgVar = (vjg) this.b;
                IBinder iBinder = (IBinder) this.c;
                synchronized (vjgVar) {
                    if (iBinder == null) {
                        vjgVar.a(0, "Null service connection");
                    } else {
                        try {
                            vjgVar.c = new djb(iBinder);
                            vjgVar.a = 2;
                            ((ScheduledExecutorService) vjgVar.Y.c).execute(new oig(vjgVar, 0));
                        } catch (RemoteException e3) {
                            vjgVar.a(0, e3.getMessage());
                        }
                    }
                }
                return;
            case 2:
                synchronized (((gig) this.c).c) {
                    try {
                        o3a o3aVar = (o3a) ((gig) this.c).o;
                        if (o3aVar != null) {
                            Exception excE = ((Task) this.b).e();
                            fp3.n(excE);
                            o3aVar.onFailure(excE);
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                vjg vjgVar2 = (vjg) this.b;
                int i = ((ckg) this.c).a;
                synchronized (vjgVar2) {
                    ckg ckgVar = (ckg) vjgVar2.X.get(i);
                    if (ckgVar != null) {
                        vjgVar2.X.remove(i);
                        ckgVar.c(new zzt("Timed out waiting for response", null));
                        vjgVar2.c();
                    }
                }
                return;
            default:
                ukg ukgVar = (ukg) this.b;
                try {
                    ukgVar.n(((Callable) this.c).call());
                    return;
                } catch (Exception e4) {
                    ukgVar.m(e4);
                    return;
                } catch (Throwable th) {
                    ukgVar.m(new RuntimeException(th));
                    return;
                }
        }
    }

    public /* synthetic */ ihg(zjg zjgVar, Task task, int i) {
        this.a = i;
        this.c = zjgVar;
        this.b = task;
    }
}
