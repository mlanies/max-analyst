package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class csa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nsa b;

    public /* synthetic */ csa(nsa nsaVar, int i) {
        this.a = i;
        this.b = nsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.a) {
            case 0:
                nsa nsaVar = this.b;
                nsaVar.j1 = false;
                msa msaVar = nsaVar.Z0;
                if (msaVar != null) {
                    msaVar.c(nsaVar);
                    break;
                }
                break;
            case 1:
                msa msaVar2 = this.b.Z0;
                if (msaVar2 != null) {
                    msaVar2.d();
                    break;
                }
                break;
            case 2:
                nsa nsaVar2 = this.b;
                nsaVar2.getClass();
                nsaVar2.K0.log("PCRTCClient", "createPeerConnectionFactoryInternal, " + nsaVar2);
                nsaVar2.W0 = false;
                break;
            case 3:
                msa msaVar3 = this.b.Z0;
                if (msaVar3 != null) {
                    msaVar3.f();
                    break;
                }
                break;
            case 4:
                nsa nsaVar3 = this.b;
                msa msaVar4 = nsaVar3.Z0;
                if (msaVar4 != null) {
                    msaVar4.b(nsaVar3);
                    break;
                }
                break;
            case 5:
                nsa nsaVar4 = this.b;
                msa msaVar5 = nsaVar4.Z0;
                if (msaVar5 != null) {
                    msaVar5.q(nsaVar4);
                    break;
                }
                break;
            case 6:
                this.b.W0 = true;
                break;
            case 7:
                nsa nsaVar5 = this.b;
                nsaVar5.q();
                kj kjVar = nsaVar5.t0;
                if (kjVar != null) {
                    kjVar.b();
                    kjVar.a.getClass();
                }
                ni niVar = nsaVar5.v0;
                if (niVar != null) {
                    e24 e24Var = niVar.c;
                    if (e24Var != null) {
                        e24Var.c(niVar);
                    }
                    niVar.c = null;
                }
                nsaVar5.K0.log("PCRTCClient", nsaVar5 + ": " + jb9.c(nsaVar5) + " was released");
                break;
            default:
                this.b.q();
                break;
        }
    }

    public /* synthetic */ csa(nsa nsaVar, String str, int i) {
        this.a = i;
        this.b = nsaVar;
    }
}
