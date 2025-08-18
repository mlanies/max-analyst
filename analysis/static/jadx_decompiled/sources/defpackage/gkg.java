package defpackage;

/* loaded from: classes.dex */
public final class gkg extends pjg {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gkg(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.pjg
    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((ykg) this.c).f) {
                    try {
                        if (((ykg) this.c).k.get() > 0 && ((ykg) this.c).k.decrementAndGet() > 0) {
                            ((ykg) this.c).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        ykg ykgVar = (ykg) this.c;
                        if (ykgVar.m != null) {
                            ykgVar.b.b("Unbind from service.", new Object[0]);
                            ykg ykgVar2 = (ykg) this.c;
                            ykgVar2.a.unbindService(ykgVar2.l);
                            ykg ykgVar3 = (ykg) this.c;
                            ykgVar3.g = false;
                            ykgVar3.m = null;
                            ykgVar3.l = null;
                        }
                        ((ykg) this.c).d();
                        return;
                    } finally {
                    }
                }
            default:
                hkg hkgVar = (hkg) this.c;
                ykg ykgVar4 = (ykg) hkgVar.b;
                ykgVar4.b.b("unlinkToDeath", new Object[0]);
                ykgVar4.m.asBinder().unlinkToDeath(ykgVar4.j, 0);
                ykg ykgVar5 = (ykg) hkgVar.b;
                ykgVar5.m = null;
                ykgVar5.g = false;
                return;
        }
    }
}
