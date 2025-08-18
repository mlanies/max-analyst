package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentWrapperWidget;
import java.util.HashSet;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.folders.picker.FolderMemberPickerScreen;
import ru.ok.messages.location.FrgLocationMap;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.tamtam.android.util.share.ShareData;

/* loaded from: classes2.dex */
public final class ie8 implements b64 {
    public final /* synthetic */ int a;
    public final i64 b;

    public ie8(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = gi4.b;
                break;
            case 2:
                this.b = zv5.b;
                break;
            case 3:
                this.b = yy5.b;
                break;
            case 4:
                this.b = yx6.b;
                break;
            case 5:
                this.b = d57.b;
                break;
            case 6:
                this.b = lf7.b;
                break;
            case 7:
                this.b = mu7.b;
                break;
            case 8:
                this.b = tw9.b;
                break;
            case 9:
                this.b = lxa.b;
                break;
            case 10:
                this.b = xjd.b;
                break;
            default:
                this.b = je8.b;
                break;
        }
    }

    @Override // defpackage.b64
    public final i64 a() {
        switch (this.a) {
            case 0:
                return (je8) this.b;
            case 1:
                return (gi4) this.b;
            case 2:
                return (zv5) this.b;
            case 3:
                return (yy5) this.b;
            case 4:
                return (yx6) this.b;
            case 5:
                return (d57) this.b;
            case 6:
                return (lf7) this.b;
            case 7:
                return (mu7) this.b;
            case 8:
                return (tw9) this.b;
            case 9:
                return (lxa) this.b;
            default:
                return (xjd) this.b;
        }
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        i iVar;
        k64 ka3Var;
        k64 m92Var;
        l64 l64Var;
        k64 k64Var;
        int i;
        i iVar2;
        l64 l64Var2;
        i64 i64Var = this.b;
        switch (this.a) {
            case 0:
                if (!((je8) i64Var).a.contains(e64Var)) {
                    return null;
                }
                je8.b.getClass();
                if (e64Var.equals(je8.c)) {
                    return new l64(str, e64Var, bundle, 1, null, new i(24), 16);
                }
                hm9.p(ie8.class.getName(), "invalid route " + e64Var, new IllegalArgumentException("invalid route " + e64Var));
                return null;
            case 1:
                if (!((gi4) i64Var).a.contains(e64Var)) {
                    return null;
                }
                if (e64Var.equals(gi4.c) || e64Var.equals(gi4.g)) {
                    iVar = new i(10);
                } else if (e64Var.equals(gi4.d)) {
                    iVar = new i(11);
                } else if (e64Var.equals(gi4.h)) {
                    iVar = new i(12);
                } else if (e64Var.equals(gi4.i)) {
                    iVar = new i(13);
                } else if (e64Var.equals(gi4.e)) {
                    iVar = new i(14);
                } else if (e64Var.equals(gi4.f)) {
                    iVar = new i(15);
                } else {
                    if (!e64Var.equals(gi4.j)) {
                        throw new IllegalStateException(au1.f("Unknown route=", e64Var));
                    }
                    iVar = new i(16);
                }
                return new l64(str, e64Var, bundle, 0, (e64Var.equals(gi4.i) || e64Var.equals(gi4.h) || e64Var.equals(gi4.j)) ? j64.c : new j64(), iVar, 8);
            case 2:
                if (!((zv5) i64Var).a.contains(e64Var)) {
                    return null;
                }
                zv5.b.getClass();
                if (e64Var.equals(zv5.c)) {
                    m92Var = new i(17);
                } else if (e64Var.equals(zv5.e)) {
                    m92Var = new m92(bundle, 3);
                } else {
                    if (!e64Var.equals(zv5.f)) {
                        if (e64Var.equals(zv5.h)) {
                            final String string = bundle.getString("folder_id");
                            if (string == null) {
                                string = "";
                            }
                            String string2 = bundle.getString("tag");
                            final String str2 = string2 != null ? string2 : "";
                            final long[] jArrW = i24.w("members_ids", bundle);
                            ka3Var = new k64() { // from class: it5
                                @Override // defpackage.k64
                                public final Object a() {
                                    return new FolderMemberPickerScreen(string, str2, jArrW);
                                }
                            };
                        } else if (e64Var.equals(zv5.d)) {
                            m92Var = new m92(bundle, 4);
                        } else {
                            if (!e64Var.equals(zv5.g)) {
                                return null;
                            }
                            ka3Var = new ka3(i24.D("id", bundle), 2);
                        }
                        return new l64(str, e64Var, bundle, 0, null, ka3Var, 24);
                    }
                    Long lV = i24.v("chat_id", bundle);
                    m92Var = new ka3(lV != null ? lV.longValue() : 0L, 1);
                }
                ka3Var = m92Var;
                return new l64(str, e64Var, bundle, 0, null, ka3Var, 24);
            case 3:
                if (!((yy5) i64Var).a.contains(e64Var)) {
                    return null;
                }
                if (!e64Var.equals(yy5.c)) {
                    throw new IllegalStateException(au1.f("invalid route ", e64Var));
                }
                final long[] jArrE = i24.E("messages_ids", bundle);
                final Long lV2 = i24.v("attach_id", bundle);
                Boolean boolU = i24.u("is_forward_attach", bundle);
                final boolean zBooleanValue = boolU != null ? boolU.booleanValue() : false;
                Boolean boolU2 = i24.u("show_ext_sharing", bundle);
                final boolean zBooleanValue2 = boolU2 != null ? boolU2.booleanValue() : false;
                return new l64(str, e64Var, bundle, 1, null, new k64() { // from class: xy5
                    @Override // defpackage.k64
                    public final Object a() {
                        return new ForwardPickerScreen(jArrE, lV2, zBooleanValue, zBooleanValue2);
                    }
                }, 16);
            case 4:
                if (!((yx6) i64Var).a.contains(e64Var)) {
                    return null;
                }
                yx6.b.getClass();
                if (e64Var.equals(yx6.c)) {
                    return new l64(str, e64Var, bundle, 1, new j64(new fh5(18), new fh5(19)), new i(18));
                }
                throw new IllegalStateException(au1.f("invalid route ", e64Var));
            case 5:
                if (!((d57) i64Var).a.contains(e64Var)) {
                    return null;
                }
                d57.b.getClass();
                if (e64Var.equals(d57.c)) {
                    return new l64(str, e64Var, bundle, 1, null, new i(19), 16);
                }
                if (e64Var.equals(d57.d)) {
                    l64Var = new l64(str, e64Var, bundle, 1, new j64(new fh5(24), new fh5(25)), new i(20));
                } else {
                    if (!e64Var.equals(d57.e)) {
                        throw new IllegalStateException(au1.f("invalid route ", e64Var));
                    }
                    l64Var = new l64(str, e64Var, bundle, 1, new j64(new fh5(26), new fh5(27)), new i(21));
                }
                return l64Var;
            case 6:
                if (!((lf7) i64Var).a.contains(e64Var)) {
                    return null;
                }
                if (e64Var.equals(lf7.c)) {
                    final er7 er7Var = new er7(i24.B("lat", bundle), i24.B("lon", bundle));
                    String string3 = bundle.getString("z");
                    Float fValueOf = string3 != null ? Float.valueOf(Float.parseFloat(string3)) : null;
                    final float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
                    Long lV3 = i24.v("chat_id", bundle);
                    final long jLongValue = lV3 != null ? lV3.longValue() : 0L;
                    Long lV4 = i24.v("msg_id", bundle);
                    final long jLongValue2 = lV4 != null ? lV4.longValue() : 0L;
                    final Long lV5 = i24.v("sender_id", bundle);
                    k64Var = new k64() { // from class: kf7
                        @Override // defpackage.k64
                        public final Object a() {
                            return new FragmentWrapperWidget(2050629066, FrgLocationMap.class, "ru.ok.messages.location.FrgLocationMap", dy7.g(new kpa("ru.ok.tamtam.extra.CHAT_ID", Long.valueOf(jLongValue)), new kpa("ru.ok.tamtam.extra.MESSAGE_ID", Long.valueOf(jLongValue2)), new kpa("ru.ok.tamtam.extra.LOCATION", er7Var), new kpa("ru.ok.tamtam.extra.ZOOM", Float.valueOf(fFloatValue)), new kpa("ru.ok.tamtam.extra.CONTACT_ID", lV5)));
                        }
                    };
                } else {
                    if (!e64Var.equals(lf7.d)) {
                        if (!e64Var.equals(lf7.e)) {
                            throw new IllegalStateException(au1.f("unknown route ", e64Var));
                        }
                        final String strF = i24.F("attachment_id", bundle);
                        final es8 es8Var = ((xw8) bundle.getParcelable("message")).a;
                        Boolean boolU3 = i24.u("single_attach", bundle);
                        final boolean zBooleanValue3 = boolU3 != null ? boolU3.booleanValue() : true;
                        Boolean boolU4 = i24.u("desc_order", bundle);
                        final boolean zBooleanValue4 = boolU4 != null ? boolU4.booleanValue() : false;
                        Boolean boolU5 = i24.u("start_auto_play", bundle);
                        final boolean zBooleanValue5 = boolU5 != null ? boolU5.booleanValue() : true;
                        Boolean boolU6 = i24.u("cast_enabled", bundle);
                        final boolean zBooleanValue6 = boolU6 != null ? boolU6.booleanValue() : true;
                        k64Var = new k64() { // from class: hf7
                            @Override // defpackage.k64
                            public final Object a() {
                                final es8 es8Var2 = es8Var;
                                final String str3 = strF;
                                final boolean z = zBooleanValue4;
                                final boolean z2 = zBooleanValue3;
                                final boolean z3 = zBooleanValue5;
                                final boolean z4 = zBooleanValue6;
                                return new a8() { // from class: jf7
                                    @Override // defpackage.a8
                                    public final void a(znc zncVar) {
                                        s10 s10Var;
                                        l20 l20Var;
                                        Activity activityF = ay7.F(zncVar);
                                        es8 es8Var3 = es8Var2;
                                        long j = es8Var3.a.t0;
                                        HashSet hashSet = ActAttachesView.z1;
                                        Intent intent = new Intent(activityF, (Class<?>) ActAttachesView.class);
                                        intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j);
                                        String str4 = str3;
                                        intent.putExtra("ru.ok.tamtam.extra.START_LOCAL_ID", str4);
                                        intent.putExtra("ru.ok.tamtam.extra.START_MESSAGE", new xw8(es8Var3));
                                        intent.putExtra("ru.ok.tamtam.extra.DESC_ORDER", z);
                                        cu8 cu8Var = es8Var3.a;
                                        intent.putExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", cu8Var.s() ? true : z2);
                                        if (z3) {
                                            intent.putExtra("ru.ok.tamtam.extra.PLAY_VIDEO_ID", str4);
                                        }
                                        intent.putExtra("ru.ok.tamtam.extra.CAST_ENABLED", z4);
                                        k8g k8gVar = cu8Var.z0;
                                        if (k8gVar.i() > 0) {
                                            int i2 = 0;
                                            while (true) {
                                                if (i2 >= k8gVar.i()) {
                                                    break;
                                                }
                                                l20 l20VarH = k8gVar.h(i2);
                                                if (l20VarH.g()) {
                                                    c20 c20Var = l20VarH.g;
                                                    if (c20Var.a()) {
                                                        l20VarH = c20Var.g;
                                                    }
                                                }
                                                boolean zF = l20VarH.f();
                                                String strA = l20VarH.s;
                                                if (zF) {
                                                    x10 x10Var = l20VarH.b;
                                                    if (!x10Var.X && l20VarH.r.equals(str4)) {
                                                        if (oag.t(strA)) {
                                                            strA = x10Var.a();
                                                        }
                                                        Uri uriR = kk5.r(strA);
                                                        if (uriR != null) {
                                                            iv6 iv6VarO = s36.o();
                                                            xv6 xv6VarD = xv6.d(uriR);
                                                            xv6VarD.d = tfg.v(activityF, l20VarH, false);
                                                            iv6VarO.f(xv6VarD.a(), null);
                                                        }
                                                    }
                                                }
                                                if (l20VarH.i()) {
                                                    s36.o().f(wv6.a(kk5.r(l20VarH.d.d)), null);
                                                } else if (l20VarH.c() && (l20Var = (s10Var = l20VarH.j).d) != null) {
                                                    if (!l20Var.f()) {
                                                        l20 l20Var2 = s10Var.d;
                                                        strA = l20Var2.i() ? l20Var2.d.d : null;
                                                    }
                                                    if (!oag.t(strA)) {
                                                        s36.o().f(wv6.a(j47.N(strA)), null);
                                                    }
                                                }
                                                i2++;
                                            }
                                        }
                                        intent.putExtra("ru.ok.tamtam.extra.COMPAT_MODE", true);
                                        intent.putExtra("ru.ok.tamtam.extra.START_COMPAT_VIDEO", true);
                                        ay7.F(zncVar).startActivity(intent);
                                    }
                                };
                            }
                        };
                        i = 3;
                        return new l64(str, e64Var, bundle, i, null, k64Var, 16);
                    }
                    final int iC = i24.C("request_code", bundle);
                    Long lV6 = i24.v("chat_id", bundle);
                    final long jLongValue3 = lV6 != null ? lV6.longValue() : 0L;
                    k64Var = new k64() { // from class: if7
                        @Override // defpackage.k64
                        public final Object a() {
                            return new FragmentWrapperWidget(2050629066, FrgLocationMap.class, "ru.ok.messages.location.FrgLocationMap", dy7.g(new kpa("ru.ok.tamtam.extra.REQUEST_CODE", Integer.valueOf(iC)), new kpa("ru.ok.tamtam.extra.CHAT_ID", Long.valueOf(jLongValue3))));
                        }
                    };
                }
                i = 1;
                return new l64(str, e64Var, bundle, i, null, k64Var, 16);
            case 7:
                ((mu7) i64Var).getClass();
                if (e64Var.equals(mu7.c)) {
                    return new l64(str, e64Var, bundle, 0, new j64(new m57(21), new m57(22)), new i(23), 8);
                }
                return null;
            case 8:
                if (!((tw9) i64Var).a.contains(e64Var)) {
                    return null;
                }
                if (e64Var.equals(tw9.c)) {
                    iVar2 = new i(26);
                } else if (e64Var.equals(tw9.d)) {
                    iVar2 = new i(27);
                } else if (e64Var.equals(tw9.e)) {
                    iVar2 = new i(28);
                } else {
                    if (!e64Var.equals(tw9.f)) {
                        throw new IllegalStateException("Unknown route".toString());
                    }
                    iVar2 = new i(29);
                }
                return new l64(str, e64Var, bundle, 0, null, iVar2, 24);
            case 9:
                if (!((lxa) i64Var).a.contains(e64Var)) {
                    return null;
                }
                j64 j64Var = j64.c;
                if (!e64Var.equals(lxa.c)) {
                    throw new IllegalStateException(au1.f("invalid route ", e64Var));
                }
                j64 j64Var2 = new j64(new s4a(15), new s4a(16));
                final int iC2 = i24.C("request_code", bundle);
                return new l64(str, e64Var, bundle, 1, j64Var2, new k64() { // from class: kxa
                    @Override // defpackage.k64
                    public final Object a() {
                        return new ContactsPickerScreen(iC2);
                    }
                });
            default:
                if (!((xjd) i64Var).a.contains(e64Var)) {
                    return null;
                }
                if (e64Var.equals(xjd.c)) {
                    l64Var2 = new l64(str, e64Var, bundle, 1, null, new m92(bundle, 7), 16);
                } else {
                    if (!e64Var.equals(xjd.d)) {
                        throw new IllegalStateException(au1.f("invalid route ", e64Var));
                    }
                    String string4 = bundle.getString("text");
                    if (string4 != null && string4.length() != 0) {
                        ShareData shareData = new ShareData(0, null, null, null, null, null, null, 127, null);
                        shareData.text = string4;
                        shareData.type = 0;
                        bundle.putParcelable("share_data", shareData);
                    }
                    l64Var2 = new l64(str, e64Var, bundle, 1, null, new m92(bundle, 8), 16);
                }
                return l64Var2;
        }
    }
}
