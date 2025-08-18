package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class kj8 implements rj8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj8 b;

    public /* synthetic */ kj8(rj8 rj8Var, int i) {
        this.a = i;
        this.b = rj8Var;
    }

    @Override // defpackage.rj8
    public final Object k(ii8 ii8Var, final oh8 oh8Var, final int i) {
        switch (this.a) {
            case 0:
                au1.r(ii8Var);
                final int i2 = 0;
                sj8.I0(null, oh8Var, i, this.b, new pj3() { // from class: lj8
                    @Override // defpackage.pj3
                    public final void accept(Object obj) {
                        wf7 wf7Var;
                        sad sadVar;
                        int i3 = i;
                        oh8 oh8Var2 = oh8Var;
                        switch (i2) {
                            case 0:
                                try {
                                    wf7Var = (wf7) ((bm7) obj).get();
                                    fm9.i(wf7Var, "LibraryResult must not be null");
                                } catch (InterruptedException | ExecutionException e) {
                                    z04.d0("Library operation failed", e);
                                    String str = wf7.g;
                                    iad iadVar = new iad("no error message provided", -1, Bundle.EMPTY);
                                    wf7Var = new wf7(iadVar.a, SystemClock.elapsedRealtime(), null, iadVar, null, 4);
                                } catch (CancellationException e2) {
                                    z04.d0("Library operation cancelled", e2);
                                    String str2 = wf7.g;
                                    iad iadVar2 = new iad("no error message provided", 1, Bundle.EMPTY);
                                    wf7Var = new wf7(iadVar2.a, SystemClock.elapsedRealtime(), null, iadVar2, null, 4);
                                }
                                try {
                                    nh8 nh8Var = oh8Var2.d;
                                    fm9.l(nh8Var);
                                    nh8Var.f(i3, wf7Var);
                                    break;
                                } catch (RemoteException e3) {
                                    z04.d0("Failed to send result to browser " + oh8Var2, e3);
                                    return;
                                }
                            default:
                                try {
                                    sadVar = (sad) ((bm7) obj).get();
                                    fm9.i(sadVar, "SessionResult must not be null");
                                } catch (InterruptedException | ExecutionException e4) {
                                    z04.d0("Session operation failed", e4);
                                    sadVar = new sad(e4.getCause() instanceof UnsupportedOperationException ? -6 : -1);
                                } catch (CancellationException e5) {
                                    z04.d0("Session operation cancelled", e5);
                                    sadVar = new sad(1);
                                }
                                sj8.M0(oh8Var2, i3, sadVar);
                                break;
                        }
                    }
                });
                throw null;
            default:
                final int i3 = 1;
                return sj8.I0(ii8Var, oh8Var, i, this.b, new pj3() { // from class: lj8
                    @Override // defpackage.pj3
                    public final void accept(Object obj) {
                        wf7 wf7Var;
                        sad sadVar;
                        int i32 = i;
                        oh8 oh8Var2 = oh8Var;
                        switch (i3) {
                            case 0:
                                try {
                                    wf7Var = (wf7) ((bm7) obj).get();
                                    fm9.i(wf7Var, "LibraryResult must not be null");
                                } catch (InterruptedException | ExecutionException e) {
                                    z04.d0("Library operation failed", e);
                                    String str = wf7.g;
                                    iad iadVar = new iad("no error message provided", -1, Bundle.EMPTY);
                                    wf7Var = new wf7(iadVar.a, SystemClock.elapsedRealtime(), null, iadVar, null, 4);
                                } catch (CancellationException e2) {
                                    z04.d0("Library operation cancelled", e2);
                                    String str2 = wf7.g;
                                    iad iadVar2 = new iad("no error message provided", 1, Bundle.EMPTY);
                                    wf7Var = new wf7(iadVar2.a, SystemClock.elapsedRealtime(), null, iadVar2, null, 4);
                                }
                                try {
                                    nh8 nh8Var = oh8Var2.d;
                                    fm9.l(nh8Var);
                                    nh8Var.f(i32, wf7Var);
                                    break;
                                } catch (RemoteException e3) {
                                    z04.d0("Failed to send result to browser " + oh8Var2, e3);
                                    return;
                                }
                            default:
                                try {
                                    sadVar = (sad) ((bm7) obj).get();
                                    fm9.i(sadVar, "SessionResult must not be null");
                                } catch (InterruptedException | ExecutionException e4) {
                                    z04.d0("Session operation failed", e4);
                                    sadVar = new sad(e4.getCause() instanceof UnsupportedOperationException ? -6 : -1);
                                } catch (CancellationException e5) {
                                    z04.d0("Session operation cancelled", e5);
                                    sadVar = new sad(1);
                                }
                                sj8.M0(oh8Var2, i32, sadVar);
                                break;
                        }
                    }
                });
        }
    }
}
