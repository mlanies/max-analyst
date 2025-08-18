package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import com.google.android.gms.tasks.Task;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.login.inputphone.InputPhoneScreen;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class d74 implements km7, ra5, grd, ree, ue4, ve4, b66, l3a, jm7, qj3, d7b, kea, y2a, ve7, cc3, u98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d74(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        return (x6g) ((c66) this.b).invoke(view, x6gVar, (Rect) this.c);
    }

    @Override // defpackage.ra5
    /* renamed from: a */
    public la5[] mo8a() {
        oc4 oc4Var = (oc4) this.b;
        mbe mbeVar = oc4Var.c;
        qy5 qy5Var = (qy5) this.c;
        return new la5[]{mbeVar.a(qy5Var) ? new gbe(oc4Var.c.e(qy5Var), qy5Var) : new mc4(qy5Var)};
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        Object obj2 = this.c;
        int i = 0;
        Object obj3 = this.b;
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                FrgAttachView frgAttachView = (FrgAttachView) obj3;
                frgAttachView.C1 = (es8) obj;
                while (true) {
                    if (i < frgAttachView.C1.a.z0.i()) {
                        l20 l20VarH = frgAttachView.C1.a.z0.h(i);
                        if (l20VarH.r.equals(frgAttachView.D1.r)) {
                            frgAttachView.D1 = l20VarH;
                        } else {
                            if (l20VarH.g()) {
                                c20 c20Var = l20VarH.g;
                                if (c20Var.g.r.equals(frgAttachView.D1.r)) {
                                    frgAttachView.D1 = c20Var.g;
                                }
                            }
                            i++;
                        }
                    }
                }
                if (frgAttachView.r1() != null) {
                    ((ActAttachesView) frgAttachView.r1()).n0(frgAttachView.C1);
                }
                ((f6) obj2).run();
                break;
            default:
                dq7 dq7Var = (dq7) obj3;
                dq7Var.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    p4d p4dVar = dq7Var.b;
                    up7 up7Var = dq7Var.X;
                    awa awaVarE = p4dVar.e(up7Var);
                    Uri uri = awaVarE != null ? awaVarE.X : null;
                    qq7 qq7Var = dq7Var.a;
                    qq7Var.N(up7Var, null, 0, uri);
                    hm9.k("dq7", "requestThumbnail " + up7Var);
                    long j = up7Var.b;
                    if (j == j) {
                        Uri uriN = j47.N(up7Var.c);
                        if (uriN != null) {
                            dq7Var.d(0, uriN.toString());
                            break;
                        } else {
                            qq7Var.N(up7Var, null, 0, null);
                            break;
                        }
                    }
                } else {
                    dq7Var.d(0, (String) obj2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.d7b
    /* renamed from: apply, reason: collision with other method in class */
    public boolean mo0apply(Object obj) {
        ((iu6) this.b).getClass();
        String strC = ((ww0) obj).c();
        int i = 0;
        while (true) {
            List list = (List) this.c;
            if (i >= list.size()) {
                return true;
            }
            if (!TextUtils.isEmpty(strC) && strC.startsWith((String) list.get(i))) {
                return false;
            }
            i++;
        }
    }

    @Override // defpackage.u98
    public void c(qr6 qr6Var, int i) {
        switch (this.a) {
            case 23:
                w98 w98Var = (w98) this.b;
                w98Var.getClass();
                qr6Var.u0(w98Var.c, i, ((gd8) this.c).c());
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                qr6Var.i0(((w98) this.b).c, i, (Surface) this.c);
                break;
            case 25:
                qr6Var.B(((w98) this.b).c, i, ((j0f) this.c).c());
                break;
            case 26:
                w98 w98Var2 = (w98) this.b;
                w98Var2.getClass();
                qr6Var.d0(w98Var2.c, i, ((tb8) this.c).d(true));
                break;
            case 27:
                w98 w98Var3 = (w98) this.b;
                w98Var3.getClass();
                c3b c3bVar = (c3b) this.c;
                c3bVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putFloat(c3b.e, c3bVar.a);
                bundle.putFloat(c3b.f, c3bVar.b);
                qr6Var.o0(w98Var3.c, i, bundle);
                break;
            default:
                w98 w98Var4 = (w98) this.b;
                w98Var4.getClass();
                ww6 ww6VarI = zw6.i();
                int i2 = 0;
                while (true) {
                    List list = (List) this.c;
                    if (i2 >= list.size()) {
                        qr6Var.Q(w98Var4.c, i, new pu0(ww6VarI.j()));
                        break;
                    } else {
                        ww6VarI.a(((tb8) list.get(i2)).d(true));
                        i2++;
                    }
                }
        }
    }

    @Override // defpackage.kea
    public String e(String str, String str2) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 16:
                bc7[] bc7VarArr = InputPhoneScreen.E0;
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) obj2;
                return kp.j((zua) inputPhoneScreen.y0.getValue(), ((lea) obj).getCode(), str2, str, ((my3) inputPhoneScreen.q0().x0.a.getValue()).b);
            default:
                bc7[] bc7VarArr2 = InviteByPhoneScreen.B0;
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) obj2;
                return kp.j((zua) inviteByPhoneScreen.x0.getValue(), ((lea) obj).getCode(), str2, str, ((my3) inviteByPhoneScreen.p0().y0.a.getValue()).b);
        }
    }

    @Override // defpackage.cc3
    public Object f(bg4 bg4Var) {
        return new va0((String) this.b, ((ig5) this.c).i((Context) bg4Var.a(Context.class)));
    }

    @Override // defpackage.ree
    public void g(cc0 cc0Var) {
        ce4 ce4Var = (ce4) this.b;
        ce4Var.getClass();
        l76 l76Var = l76.b;
        if (((see) this.c).c.a() && cc0Var.d) {
            l76Var = l76.c;
        }
        zm4 zm4Var = ce4Var.a;
        o76.d((AtomicBoolean) zm4Var.c, true);
        o76.c((Thread) zm4Var.e);
        if (((l76) zm4Var.n) != l76Var) {
            zm4Var.n = l76Var;
            zm4Var.v(zm4Var.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    @Override // defpackage.ue4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ffc i(int r17, defpackage.qze r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d74.i(int, qze, int[]):ffc");
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((gd) obj).M((fd) this.b, (h30) this.c);
                break;
            case 1:
                fd fdVar = (fd) this.b;
                jlf jlfVar = (jlf) this.c;
                ((gd) obj).T(fdVar, jlfVar);
                int i = jlfVar.a;
                break;
            case 2:
                ((gd) obj).B0((fd) this.b, (Exception) this.c);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((m3b) obj).G(((z2b) this.b).h, (b0f) this.c);
                break;
            default:
                ((n3b) obj).G(((Integer) this.c).intValue(), (tb8) this.b);
                break;
        }
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) throws Exception {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 4:
                mpb mpbVar = (mpb) obj;
                ((bd4) obj2).getClass();
                try {
                    if (nqdVar.h()) {
                        return;
                    }
                    hm9.m("bd4", "start connect to host: %s", mpbVar.f.toString());
                    try {
                        mpbVar.e = nqdVar;
                        mpbVar.connect();
                        nqdVar.a(mpbVar);
                        return;
                    } catch (Exception e) {
                        hm9.m("bd4", "close socket for host: %s", mpbVar.f.toString());
                        Socket socket = mpbVar.d;
                        if (socket != null) {
                            try {
                                socket.close();
                            } catch (Exception unused) {
                            }
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    if (nqdVar.h()) {
                        return;
                    }
                    nqdVar.onError(e2);
                    return;
                }
            default:
                vy7 vy7Var = (vy7) obj2;
                vy7Var.getClass();
                vy7.a();
                xke xkeVar = vy7Var.f;
                xkeVar.getClass();
                int i = gpc.E;
                pq9 pq9Var = qp4.u0;
                Context context = xkeVar.a;
                Context context2 = (Context) obj;
                Bitmap bitmapO0 = j47.o0(i, k7d.h(pq9Var, context).k, context2);
                Bitmap bitmapJ0 = j47.j0((int) (bitmapO0.getWidth() * 1.5d), (int) (bitmapO0.getHeight() * 1.5d), bitmapO0);
                ConcurrentHashMap concurrentHashMap = vy7Var.e;
                uy7 uy7Var = uy7.a;
                vy7Var.g.getClass();
                concurrentHashMap.put(uy7Var, qx7.i(bitmapO0));
                boolean z = vy7Var.h;
                if (z) {
                    bitmapO0.recycle();
                }
                concurrentHashMap.put(uy7.b, qx7.i(bitmapJ0));
                if (z) {
                    bitmapJ0.recycle();
                }
                Bitmap bitmapO02 = j47.o0(gpc.F, k7d.h(pq9Var, context).k, context2);
                Bitmap bitmapJ02 = j47.j0((int) (bitmapO02.getWidth() * 1.5d), (int) (bitmapO02.getHeight() * 1.5d), bitmapO02);
                concurrentHashMap.put(uy7.c, qx7.i(bitmapO02));
                if (z) {
                    bitmapO02.recycle();
                }
                concurrentHashMap.put(uy7.o, qx7.i(bitmapJ02));
                if (z) {
                    bitmapJ02.recycle();
                }
                nqdVar.a(concurrentHashMap);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    @Override // defpackage.ve4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ffc k(int r17, defpackage.rze r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d74.k(int, rze, int[]):ffc");
    }

    @Override // defpackage.l3a
    public void l(Task task) {
        ((f25) this.b).a((Intent) this.c);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 10:
                List list = (List) obj;
                sx4 sx4Var = (sx4) this.b;
                sx4Var.getClass();
                lw4 lw4Var = (lw4) this.c;
                return new lw4(lw4Var.a, lw4Var.b, sx4Var.c.e(lw4Var.c), list, lw4Var.e, lw4Var.f, lw4Var.g);
            default:
                jg5 jg5Var = (jg5) this.b;
                jg5Var.getClass();
                for (es8 es8Var : (List) obj) {
                    cu8 cu8Var = es8Var.a;
                    g20 g20Var = g20.u0;
                    if (cu8Var.m(g20Var)) {
                        cu8 cu8Var2 = es8Var.a;
                        l20 l20VarK = cu8Var2.z0.k(g20Var);
                        if (l20VarK != null) {
                            if (((String) this.c).equals(l20VarK.r)) {
                                tp7 tp7VarM = ((jyc) jg5Var.b).m();
                                tp7VarM.getClass();
                                return tp7.b(tp7VarM, cu8Var2.b, false, 26);
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return iqd.f(new IllegalStateException("no message found on screen"));
        }
    }
}
