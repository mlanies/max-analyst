package defpackage;

/* loaded from: classes.dex */
public final class ljg extends sig {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ljg(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.sig
    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((mkg) this.c).f) {
                    try {
                        if (((mkg) this.c).k.get() > 0 && ((mkg) this.c).k.decrementAndGet() > 0) {
                            ((mkg) this.c).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        mkg mkgVar = (mkg) this.c;
                        if (mkgVar.m != null) {
                            mkgVar.b.b("Unbind from service.", new Object[0]);
                            mkg mkgVar2 = (mkg) this.c;
                            mkgVar2.a.unbindService(mkgVar2.l);
                            mkg mkgVar3 = (mkg) this.c;
                            mkgVar3.g = false;
                            mkgVar3.m = null;
                            mkgVar3.l = null;
                        }
                        ((mkg) this.c).c();
                        return;
                    } finally {
                    }
                }
            default:
                hkg hkgVar = (hkg) this.c;
                mkg mkgVar4 = (mkg) hkgVar.b;
                mkgVar4.b.b("unlinkToDeath", new Object[0]);
                mkgVar4.m.asBinder().unlinkToDeath(mkgVar4.j, 0);
                mkg mkgVar5 = (mkg) hkgVar.b;
                mkgVar5.m = null;
                mkgVar5.g = false;
                return;
        }
    }
}
