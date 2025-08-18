package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class nqa implements pg1 {
    public final /* synthetic */ int a;
    public final Object b;

    public nqa() {
        this.a = 0;
        this.b = new CopyOnWriteArraySet();
    }

    private final void a(mg1 mg1Var) {
    }

    private final void b(ng1 ng1Var) {
    }

    private final void c(og1 og1Var) {
    }

    @Override // defpackage.pg1
    public final void onCallParticipantsAdded(lg1 lg1Var) {
        switch (this.a) {
            case 0:
                if (!lg1Var.b.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((pg1) it.next()).onCallParticipantsAdded(lg1Var);
                    }
                    break;
                }
                break;
            default:
                h7b h7bVar = (h7b) this.b;
                if (!((py0) h7bVar.b).s() && !((py0) h7bVar.b).p1.i().isEmpty()) {
                    py0 py0Var = (py0) h7bVar.b;
                    py0Var.B(py0Var.y1.f);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.pg1
    public final void onCallParticipantsChanged(mg1 mg1Var) {
        switch (this.a) {
            case 0:
                if (!mg1Var.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((pg1) it.next()).onCallParticipantsChanged(mg1Var);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.pg1
    public final void onCallParticipantsDeAnonimized(ng1 ng1Var) {
        switch (this.a) {
            case 0:
                if (!ng1Var.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((pg1) it.next()).onCallParticipantsDeAnonimized(ng1Var);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.pg1
    public final void onCallParticipantsRemoved(og1 og1Var) {
        switch (this.a) {
            case 0:
                if (!og1Var.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((pg1) it.next()).onCallParticipantsRemoved(og1Var);
                    }
                    break;
                }
                break;
        }
    }

    public nqa(h7b h7bVar) {
        this.a = 1;
        this.b = h7bVar;
    }
}
