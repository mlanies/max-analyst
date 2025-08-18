package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import org.webrtc.PeerConnection;

/* loaded from: classes.dex */
public abstract class ny1 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public ny1(nsa nsaVar) {
        this.a = 1;
        this.b = nsaVar;
    }

    public static void b(s7g s7gVar, String str) {
        v8g v8gVar;
        boolean z;
        WorkDatabase workDatabase = s7gVar.c;
        i8g i8gVarY = workDatabase.y();
        ph4 ph4VarT = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            m7g m7gVarJ = i8gVarY.j(str2);
            if (m7gVarJ != m7g.c && m7gVarJ != m7g.o) {
                i8gVarY.q(m7g.Y, str2);
            }
            linkedList.addAll(ph4VarT.n(str2));
        }
        y9b y9bVar = s7gVar.f;
        synchronized (y9bVar.w0) {
            try {
                a14.u().n(y9b.x0, "Processor cancelling " + str);
                y9bVar.u0.add(str);
                v8gVar = (v8g) y9bVar.Y.remove(str);
                z = v8gVar != null;
                if (v8gVar == null) {
                    v8gVar = (v8g) y9bVar.Z.remove(str);
                }
                if (v8gVar != null) {
                    y9bVar.s0.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y9b.c(str, v8gVar);
        if (z) {
            y9bVar.i();
        }
        Iterator it = s7gVar.e.iterator();
        while (it.hasNext()) {
            ((auc) it.next()).d(str);
        }
    }

    public abstract void a(PeerConnection peerConnection);

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                imc imcVar = (imc) this.b;
                try {
                    c();
                    imcVar.V(pma.Q);
                    break;
                } catch (Throwable th) {
                    imcVar.V(new mma(th));
                    return;
                }
            default:
                PeerConnection peerConnectionG = ((nsa) this.b).G();
                if (peerConnectionG != null) {
                    a(peerConnectionG);
                    break;
                }
                break;
        }
    }

    public ny1() {
        this.a = 0;
        this.b = new imc(28);
    }
}
