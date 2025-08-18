package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* loaded from: classes2.dex */
public final /* synthetic */ class vj9 implements qj3, grd {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj9 b;

    public /* synthetic */ vj9(zj9 zj9Var, int i) {
        this.a = i;
        this.b = zj9Var;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) throws Resources.NotFoundException {
        final mqb mqbVar;
        final int i = 1;
        final zj9 zj9Var = this.b;
        final int i2 = 0;
        switch (this.a) {
            case 0:
                zj9Var.getClass();
                hm9.r("zj9", (Throwable) obj, "startCrop error", new Object[0]);
                int i3 = jpc.E;
                ActLocalMedias actLocalMedias = (ActLocalMedias) zj9Var.c;
                actLocalMedias.getClass();
                Handler handler = a14.i;
                a14.N(0, actLocalMedias, actLocalMedias.getString(i3));
                break;
            default:
                final yj9 yj9Var = (yj9) obj;
                zj9Var.getClass();
                hm9.k("zj9", "initVideoLocalMediasResult doOnSuccess");
                zj9Var.Z = yj9Var.c;
                long j = yj9Var.a;
                zj9Var.s0 = j;
                zj9Var.t0 = yj9Var.b;
                if (j == 0) {
                    hm9.k("zj9", "videoDuration == 0 -> hide controls");
                    zj9Var.d2(new mu1(11));
                } else if (yj9Var.d) {
                    hm9.k("zj9", "showQualityButton == true");
                    zj9Var.d2(new l66() { // from class: xj9
                        @Override // defpackage.l66
                        public final Object apply(Object obj2) {
                            oq7 oq7Var = (oq7) obj2;
                            switch (i2) {
                                case 0:
                                    zj9 zj9Var2 = zj9Var;
                                    zj9Var2.getClass();
                                    yj9 yj9Var2 = (yj9) yj9Var;
                                    oq7Var.i = yj9Var2.b.a;
                                    oq7Var.a = true;
                                    oq7Var.b = true;
                                    oq7Var.g = false;
                                    oq7Var.h = false;
                                    oq7Var.c = false;
                                    oq7Var.n = zj9Var2.t0.d;
                                    oq7Var.o = yj9Var2.e;
                                    break;
                                default:
                                    zj9 zj9Var3 = zj9Var;
                                    zj9Var3.getClass();
                                    oq7Var.a = false;
                                    oq7Var.b = true;
                                    oq7Var.c = false;
                                    oq7Var.i = (mqb) yj9Var;
                                    oq7Var.g = false;
                                    oq7Var.h = false;
                                    oq7Var.n = zj9Var3.t0.d;
                                    break;
                            }
                            return oq7Var;
                        }
                    });
                } else {
                    hm9.k("zj9", "showQualityButton == false");
                    if (zj9Var.Z.isEmpty()) {
                        hm9.k("zj9", "allowedQualities is empty -> set default 480p");
                        mqbVar = mqb.P_480;
                    } else {
                        mqbVar = zj9Var.t0.a;
                    }
                    zj9Var.d2(new l66() { // from class: xj9
                        @Override // defpackage.l66
                        public final Object apply(Object obj2) {
                            oq7 oq7Var = (oq7) obj2;
                            switch (i) {
                                case 0:
                                    zj9 zj9Var2 = zj9Var;
                                    zj9Var2.getClass();
                                    yj9 yj9Var2 = (yj9) mqbVar;
                                    oq7Var.i = yj9Var2.b.a;
                                    oq7Var.a = true;
                                    oq7Var.b = true;
                                    oq7Var.g = false;
                                    oq7Var.h = false;
                                    oq7Var.c = false;
                                    oq7Var.n = zj9Var2.t0.d;
                                    oq7Var.o = yj9Var2.e;
                                    break;
                                default:
                                    zj9 zj9Var3 = zj9Var;
                                    zj9Var3.getClass();
                                    oq7Var.a = false;
                                    oq7Var.b = true;
                                    oq7Var.c = false;
                                    oq7Var.i = (mqb) mqbVar;
                                    oq7Var.g = false;
                                    oq7Var.h = false;
                                    oq7Var.n = zj9Var3.t0.d;
                                    break;
                            }
                            return oq7Var;
                        }
                    });
                }
                tj9 tj9Var = zj9Var.c;
                if (tj9Var != null) {
                    ((ActLocalMedias) tj9Var).p0(!zj9Var.t0.d, false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) throws Throwable {
        ref refVar;
        ref refVar2;
        zj9 zj9Var = this.b;
        String strA = zj9Var.X.a();
        ActLocalMedias actLocalMedias = (ActLocalMedias) zj9Var.c;
        actLocalMedias.getClass();
        em5 em5VarU = s36.u(actLocalMedias, Uri.parse(strA));
        Collections.emptyList();
        if (em5VarU.c == 0 || nqdVar.h()) {
            return;
        }
        i20 i20Var = new i20(1);
        Object next = null;
        i20Var.a = null;
        i20Var.b = 0.0f;
        i20Var.c = 1.0f;
        i20Var.d = false;
        ref refVar3 = new ref(i20Var);
        r4d r4dVarH = zj9Var.w0.h(zj9Var.X);
        if (r4dVarH != null && (refVar2 = r4dVarH.b) != null) {
            i20 i20Var2 = new i20(1);
            i20Var2.a = refVar2.a;
            i20Var2.b = refVar2.b;
            i20Var2.c = refVar2.c;
            i20Var2.d = refVar2.d;
            refVar3 = new ref(i20Var2);
        }
        if (nqdVar.h()) {
            return;
        }
        ArrayList arrayListS = j1e.s(Uri.parse(zj9Var.X.a()), actLocalMedias, (cj0) ((y8a) ((ed3) actLocalMedias.K0.b)).getAccessor().c(cj0.class));
        if (arrayListS == null) {
            arrayListS = new ArrayList();
        } else {
            Collections.sort(arrayListS, nqb.g);
        }
        ArrayList arrayList = arrayListS;
        boolean z = arrayList.size() > 1;
        if (arrayList.size() > 0 && refVar3.a == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    mqb mqbVar = ((nqb) next).a;
                    do {
                        Object next2 = it.next();
                        mqb mqbVar2 = ((nqb) next2).a;
                        if (mqbVar.compareTo(mqbVar2) > 0) {
                            next = next2;
                            mqbVar = mqbVar2;
                        }
                    } while (it.hasNext());
                }
            }
            nqb nqbVar = (nqb) next;
            mqb mqbVar3 = zj9Var.Y.a;
            if (nqbVar != null) {
                mqb mqbVar4 = nqbVar.a;
                if (mqbVar4.compareTo(mqbVar3) >= 0) {
                    mqbVar3 = mqbVar4;
                }
            }
            i20 i20VarA = refVar3.a();
            i20VarA.a = mqbVar3;
            refVar3 = new ref(i20VarA);
        }
        if (em5VarU.b) {
            refVar = refVar3;
        } else {
            i20 i20VarA2 = refVar3.a();
            i20VarA2.d = true;
            refVar = new ref(i20VarA2);
        }
        nqdVar.a(new yj9(em5VarU.c, refVar, arrayList, z, em5VarU.b));
    }
}
