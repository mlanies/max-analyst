package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.DumpCallback;
import org.webrtc.DumpSource;
import org.webrtc.PeerConnectionFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class cy0 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ cy0(da8 da8Var, AtomicInteger atomicInteger, List list, ArrayList arrayList, int i) {
        this.a = 2;
        this.c = da8Var;
        this.o = atomicInteger;
        this.X = list;
        this.Y = arrayList;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                py0 py0Var = (py0) this.c;
                String str = (String) this.o;
                int i = this.b;
                Set<DumpSource> set = (Set) this.X;
                DumpCallback dumpCallback = (DumpCallback) this.Y;
                py0Var.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = py0Var.k1.d;
                    if (peerConnectionFactory != null) {
                        peerConnectionFactory.submitDumpRequest(str, (int) TimeUnit.SECONDS.toMillis(i), set, dumpCallback);
                        break;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    py0Var.V0.logException("OKRTCCall", "Error starting local audio dump", th);
                    return;
                }
            case 1:
                int i2 = this.b + 1;
                a81 a81Var = (a81) ((k56) this.X);
                x5 x5Var = (x5) ((k56) this.Y);
                f81 f81Var = (f81) this.c;
                f81Var.getClass();
                ViewPager2 viewPager2 = (ViewPager2) this.o;
                if (!viewPager2.isInLayout()) {
                    a81Var.invoke();
                    break;
                } else if (i2 != 5) {
                    viewPager2.post(new cy0(f81Var, viewPager2, i2, a81Var, x5Var, 1));
                    break;
                } else {
                    x5Var.invoke();
                    break;
                }
            case 2:
                da8 da8Var = (da8) this.c;
                da8Var.getClass();
                int iIncrementAndGet = ((AtomicInteger) this.o).incrementAndGet();
                List list = (List) this.X;
                if (iIncrementAndGet == list.size()) {
                    int i3 = 0;
                    while (true) {
                        List list2 = (List) this.Y;
                        if (i3 >= list2.size()) {
                            break;
                        } else {
                            bm7 bm7Var = (bm7) list2.get(i3);
                            if (bm7Var != null) {
                                try {
                                    bitmap = (Bitmap) fm9.C(bm7Var);
                                } catch (CancellationException | ExecutionException e) {
                                    z04.s(e, "Failed to get bitmap");
                                }
                            } else {
                                bitmap = null;
                            }
                            da8Var.g.p(gf7.g((tb8) list.get(i3), bitmap), this.b + i3);
                            i3++;
                        }
                    }
                }
                break;
            default:
                ri8 ri8Var = (ri8) this.Y;
                si8 si8Var = (si8) this.c;
                if (!si8Var.f.i()) {
                    boolean zIsActive = si8Var.j.a.a.isActive();
                    y9d y9dVar = (y9d) this.o;
                    int i4 = this.b;
                    vi8 vi8Var = (vi8) this.X;
                    if (!zIsActive) {
                        StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb.append(y9dVar == null ? Integer.valueOf(i4) : y9dVar.b);
                        sb.append(", pid=");
                        sb.append(vi8Var.a.b);
                        z04.c0(sb.toString());
                        break;
                    } else {
                        oh8 oh8VarR = si8Var.R(vi8Var);
                        m5d m5dVar = si8Var.e;
                        if (y9dVar != null) {
                            if (!m5dVar.I(oh8VarR, y9dVar)) {
                            }
                        } else if (!m5dVar.H(oh8VarR, i4)) {
                        }
                        try {
                            ri8Var.b(oh8VarR);
                            break;
                        } catch (RemoteException e2) {
                            z04.d0("Exception in " + oh8VarR, e2);
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ cy0(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
        this.X = obj3;
        this.Y = obj4;
    }
}
