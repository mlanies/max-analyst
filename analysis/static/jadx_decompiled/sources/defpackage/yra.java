package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class yra implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nsa b;
    public final /* synthetic */ String c;

    public /* synthetic */ yra(nsa nsaVar, String str, int i) {
        this.a = i;
        this.b = nsaVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nsa nsaVar = this.b;
                nsaVar.getClass();
                StringBuilder sb = new StringBuilder("set sdp error ");
                String str = this.c;
                sb.append(str);
                nsaVar.j(sb.toString(), "set.sdp2");
                nsaVar.J0.log(e0e.callError, "setSdpFailed", (String) null);
                nsaVar.C0.post(new csa(nsaVar, str, 3));
                break;
            case 1:
                nsa nsaVar2 = this.b;
                nsaVar2.getClass();
                StringBuilder sb2 = new StringBuilder("create sdp error ");
                String str2 = this.c;
                sb2.append(str2);
                nsaVar2.j(sb2.toString(), "create.sdp2");
                nsaVar2.J0.log(e0e.callError, "onCreateSDPFailed", (String) null);
                nsaVar2.C0.post(new csa(nsaVar2, str2, 1));
                break;
            default:
                nsa nsaVar3 = this.b;
                msa msaVar = nsaVar3.Z0;
                if (msaVar != null) {
                    msaVar.g(nsaVar3, this.c);
                    break;
                }
                break;
        }
    }
}
