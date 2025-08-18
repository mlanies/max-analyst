package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final class sh extends r25 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh(ilc ilcVar, int i) {
        super(ilcVar);
        this.o = i;
    }

    @Override // defpackage.r25
    public final void A(q36 q36Var, Object obj) {
        String str;
        int i;
        switch (this.o) {
            case 0:
                ii iiVar = (ii) obj;
                q36Var.j(1, iiVar.a);
                q36Var.j(2, iiVar.b);
                String str2 = iiVar.c;
                if (str2 == null) {
                    q36Var.W(3);
                } else {
                    q36Var.f(3, str2);
                }
                String str3 = iiVar.d;
                if (str3 == null) {
                    q36Var.W(4);
                } else {
                    q36Var.f(4, str3);
                }
                String str4 = iiVar.e;
                if (str4 == null) {
                    q36Var.W(5);
                } else {
                    q36Var.f(5, str4);
                }
                Long l = iiVar.f;
                if (l == null) {
                    q36Var.W(6);
                } else {
                    q36Var.j(6, l.longValue());
                }
                String str5 = iiVar.g;
                if (str5 == null) {
                    q36Var.W(7);
                    return;
                } else {
                    q36Var.f(7, str5);
                    return;
                }
            case 1:
                nj njVar = (nj) obj;
                q36Var.j(1, njVar.a);
                String str6 = njVar.b;
                if (str6 == null) {
                    q36Var.W(2);
                } else {
                    q36Var.f(2, str6);
                }
                String str7 = njVar.c;
                if (str7 == null) {
                    q36Var.W(3);
                } else {
                    q36Var.f(3, str7);
                }
                String str8 = njVar.d;
                if (str8 == null) {
                    q36Var.W(4);
                } else {
                    q36Var.f(4, str8);
                }
                q36Var.j(5, njVar.e);
                String string = new JSONArray((Collection<?>) njVar.f).toString();
                if (string == null) {
                    q36Var.W(6);
                    return;
                } else {
                    q36Var.f(6, string);
                    return;
                }
            case 2:
                ec1 ec1Var = (ec1) obj;
                String str9 = ec1Var.a;
                if (str9 == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str9);
                }
                String str10 = ec1Var.b;
                if (str10 == null) {
                    q36Var.W(2);
                } else {
                    q36Var.f(2, str10);
                }
                q36Var.j(3, ec1Var.c);
                return;
            case 3:
                km3 km3Var = (km3) obj;
                q36Var.j(1, km3Var.a);
                q36Var.j(2, km3Var.b);
                q36Var.j(3, km3Var.c);
                q36Var.j(4, km3Var.d);
                q36Var.k(5, km3Var.e.d());
                return;
            case 4:
                au1.r(obj);
                throw null;
            case 5:
                mh4 mh4Var = (mh4) obj;
                String str11 = mh4Var.a;
                if (str11 == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str11);
                }
                String str12 = mh4Var.b;
                if (str12 == null) {
                    q36Var.W(2);
                    return;
                } else {
                    q36Var.f(2, str12);
                    return;
                }
            case 6:
                np4 np4Var = (np4) obj;
                String str13 = np4Var.b;
                if (str13 == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str13);
                }
                q36Var.j(2, np4Var.c);
                q36Var.j(3, au1.s(np4Var.d));
                fp4 fp4Var = np4Var.a;
                q36Var.j(4, fp4Var.a);
                String str14 = fp4Var.b;
                if (str14 == null) {
                    q36Var.W(5);
                } else {
                    q36Var.f(5, str14);
                }
                i20 i20Var = np4Var.e;
                if (i20Var != null) {
                    q36Var.j(6, i20Var.a.b);
                    q36Var.h(7, i20Var.b);
                    q36Var.h(8, i20Var.c);
                    q36Var.j(9, i20Var.d ? 1L : 0L);
                    return;
                }
                q36Var.W(6);
                q36Var.W(7);
                q36Var.W(8);
                q36Var.W(9);
                return;
            case 7:
                tc5 tc5Var = (tc5) obj;
                q36Var.j(1, tc5Var.a);
                q36Var.j(2, tc5Var.b);
                return;
            case 8:
                ac5 ac5Var = (ac5) obj;
                q36Var.j(1, ac5Var.a);
                q36Var.j(2, ac5Var.b);
                return;
            case 9:
                vd5 vd5Var = (vd5) obj;
                q36Var.j(1, vd5Var.a);
                q36Var.j(2, vd5Var.b);
                q36Var.j(3, vd5Var.c);
                q36Var.j(4, vd5Var.d != 0 ? au1.s(r2) : 0);
                Long l2 = vd5Var.e;
                if (l2 == null) {
                    q36Var.W(5);
                } else {
                    q36Var.j(5, l2.longValue());
                }
                q36Var.j(6, vd5Var.f);
                Long l3 = vd5Var.g;
                if (l3 == null) {
                    q36Var.W(7);
                } else {
                    q36Var.j(7, l3.longValue());
                }
                String str15 = vd5Var.h;
                if (str15 == null) {
                    q36Var.W(8);
                } else {
                    q36Var.f(8, str15);
                }
                q36Var.j(9, vd5Var.i);
                q36Var.j(10, vd5Var.j);
                String str16 = vd5Var.k;
                if (str16 == null) {
                    q36Var.W(11);
                } else {
                    q36Var.f(11, str16);
                }
                q36Var.j(12, vd5Var.l);
                q36Var.j(13, vd5Var.m);
                return;
            case 10:
                me5 me5Var = (me5) obj;
                q36Var.j(1, me5Var.a);
                q36Var.j(2, me5Var.b);
                return;
            case 11:
                ky8 ky8Var = (ky8) obj;
                String str17 = ky8Var.b;
                if (str17 == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str17);
                }
                q36Var.j(2, ky8Var.c);
                q36Var.j(3, au1.s(ky8Var.d));
                bu1 bu1Var = ky8Var.a;
                q36Var.j(4, bu1Var.a);
                q36Var.j(5, bu1Var.b);
                String str18 = (String) bu1Var.c;
                if (str18 == null) {
                    q36Var.W(6);
                } else {
                    q36Var.f(6, str18);
                }
                i20 i20Var2 = ky8Var.e;
                if (i20Var2 != null) {
                    q36Var.j(7, i20Var2.a.b);
                    q36Var.h(8, i20Var2.b);
                    q36Var.h(9, i20Var2.c);
                    q36Var.j(10, i20Var2.d ? 1L : 0L);
                    return;
                }
                q36Var.W(7);
                q36Var.W(8);
                q36Var.W(9);
                q36Var.W(10);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                je5 je5Var = (je5) obj;
                q36Var.j(1, je5Var.a);
                q36Var.j(2, je5Var.b);
                ne5 ne5Var = je5Var.c;
                String str19 = ne5Var != null ? ne5Var.a : null;
                if (str19 == null) {
                    q36Var.W(3);
                } else {
                    q36Var.f(3, str19);
                }
                String str20 = je5Var.d;
                if (str20 == null) {
                    q36Var.W(4);
                } else {
                    q36Var.f(4, str20);
                }
                String str21 = je5Var.e;
                if (str21 == null) {
                    q36Var.W(5);
                } else {
                    q36Var.f(5, str21);
                }
                q36Var.j(6, je5Var.f);
                q36Var.j(7, je5Var.g);
                String str22 = je5Var.h;
                if (str22 == null) {
                    q36Var.W(8);
                } else {
                    q36Var.f(8, str22);
                }
                q36Var.j(9, je5Var.i);
                String str23 = je5Var.j;
                if (str23 == null) {
                    q36Var.W(10);
                } else {
                    q36Var.f(10, str23);
                }
                String str24 = je5Var.k;
                if (str24 == null) {
                    q36Var.W(11);
                } else {
                    q36Var.f(11, str24);
                }
                q36Var.j(12, je5Var.l ? 1L : 0L);
                q36Var.j(13, je5Var.m ? 1L : 0L);
                return;
            case 13:
                qv9 qv9Var = (qv9) obj;
                q36Var.j(1, qv9Var.a);
                q36Var.j(2, qv9Var.b);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                vx9 vx9Var = (vx9) obj;
                q36Var.j(1, vx9Var.a);
                q36Var.j(2, vx9Var.b);
                q36Var.j(3, vx9Var.c);
                Boolean bool = vx9Var.d;
                if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                    q36Var.W(4);
                } else {
                    q36Var.j(4, r3.intValue());
                }
                ks4 ks4Var = vx9Var.e;
                String str25 = ks4Var != null ? ks4Var.a : null;
                if (str25 == null) {
                    q36Var.W(5);
                    return;
                } else {
                    q36Var.f(5, str25);
                    return;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                xua xuaVar = (xua) obj;
                q36Var.j(1, xuaVar.a);
                q36Var.j(2, xuaVar.b);
                q36Var.j(3, xuaVar.c);
                String str26 = xuaVar.d;
                if (str26 == null) {
                    q36Var.W(4);
                } else {
                    q36Var.f(4, str26);
                }
                q36Var.j(5, xuaVar.e);
                String str27 = xuaVar.f;
                if (str27 == null) {
                    q36Var.W(6);
                } else {
                    q36Var.f(6, str27);
                }
                String str28 = xuaVar.g;
                if (str28 == null) {
                    q36Var.W(7);
                } else {
                    q36Var.f(7, str28);
                }
                String str29 = xuaVar.h;
                if (str29 == null) {
                    q36Var.W(8);
                } else {
                    q36Var.f(8, str29);
                }
                String str30 = xuaVar.i;
                if (str30 == null) {
                    q36Var.W(9);
                } else {
                    q36Var.f(9, str30);
                }
                q36Var.j(10, au1.s(xuaVar.j));
                return;
            case 16:
                g7b g7bVar = (g7b) obj;
                String str31 = g7bVar.a;
                if (str31 == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str31);
                }
                Long l4 = g7bVar.b;
                if (l4 == null) {
                    q36Var.W(2);
                    return;
                } else {
                    q36Var.j(2, l4.longValue());
                    return;
                }
            case LangUtils.HASH_SEED /* 17 */:
                wgb wgbVar = (wgb) obj;
                q36Var.j(1, wgbVar.a);
                q36Var.j(2, wgbVar.b);
                byte[] bArr = b.a;
                Protos.SelfProfile selfProfile = new Protos.SelfProfile();
                bdb bdbVar = wgbVar.c;
                Map map = (Map) bdbVar.b;
                selfProfile.restrictions = new HashMap(map.size());
                if (!map.isEmpty()) {
                    for (Integer num : map.keySet()) {
                        Protos.RestrictionsInfo restrictionsInfo = new Protos.RestrictionsInfo();
                        restrictionsInfo.expiration = ((jjc) map.get(num)).a;
                        selfProfile.restrictions.put(num, restrictionsInfo);
                    }
                }
                List list = (List) bdbVar.c;
                selfProfile.profileOptions = new int[list.size()];
                if (!list.isEmpty()) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr = selfProfile.profileOptions;
                        if (i2 < iArr.length) {
                            iArr[i2] = ((Integer) list.get(i2)).intValue();
                            i2++;
                        }
                    }
                }
                q36Var.k(3, qw8.toByteArray(selfProfile));
                return;
            case 18:
                z6c z6cVar = (z6c) obj;
                String str32 = z6cVar.a;
                if (str32 == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str32);
                }
                q36Var.j(2, z6cVar.b);
                String string2 = new JSONArray((Collection<?>) z6cVar.c).toString();
                if (string2 == null) {
                    q36Var.W(3);
                    return;
                } else {
                    q36Var.f(3, string2);
                    return;
                }
            case 19:
                e9c e9cVar = (e9c) obj;
                q36Var.j(1, e9cVar.a);
                q36Var.j(2, e9cVar.b.a);
                q36Var.j(3, e9cVar.c);
                q36Var.j(4, e9cVar.d);
                lh4 lh4Var = e9cVar.e;
                if (lh4Var != null) {
                    q36Var.j(5, lh4Var.a);
                } else {
                    q36Var.W(5);
                }
                cy4 cy4Var = e9cVar.f;
                if (cy4Var == null || (str = cy4Var.a) == null) {
                    q36Var.W(6);
                } else {
                    q36Var.f(6, str);
                }
                g03 g03Var = e9cVar.g;
                if (g03Var == null) {
                    q36Var.W(7);
                    q36Var.W(8);
                    return;
                }
                byte[] bArr2 = (byte[]) g03Var.c;
                if (bArr2 == null) {
                    q36Var.W(7);
                } else {
                    q36Var.k(7, bArr2);
                }
                q36Var.j(8, g03Var.b);
                return;
            case 20:
                nkc nkcVar = (nkc) obj;
                String str33 = nkcVar.a;
                if (str33 == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str33);
                }
                String str34 = nkcVar.b;
                if (str34 == null) {
                    q36Var.W(2);
                } else {
                    q36Var.f(2, str34);
                }
                String str35 = nkcVar.c;
                if (str35 == null) {
                    q36Var.W(3);
                } else {
                    q36Var.f(3, str35);
                }
                q36Var.j(4, nkcVar.d);
                q36Var.f(5, dy7.p(nkcVar.e));
                q36Var.j(6, nkcVar.f ? 1L : 0L);
                q36Var.j(7, nkcVar.g ? 1L : 0L);
                List list2 = nkcVar.h;
                byte[] bArrB = list2 != null ? ou8.b(list2) : null;
                if (bArrB == null) {
                    q36Var.W(8);
                } else {
                    q36Var.k(8, bArrB);
                }
                Long l5 = nkcVar.i;
                if (l5 == null) {
                    q36Var.W(9);
                } else {
                    q36Var.j(9, l5.longValue());
                }
                Map map2 = nkcVar.j;
                byte[] byteArray = map2 != null ? qw8.toByteArray(xfg.i(map2)) : null;
                if (byteArray == null) {
                    q36Var.W(10);
                } else {
                    q36Var.k(10, byteArray);
                }
                List list3 = nkcVar.k;
                byte[] byteArray2 = list3 != null ? qw8.toByteArray(xfg.k(list3)) : null;
                if (byteArray2 == null) {
                    q36Var.W(11);
                } else {
                    q36Var.k(11, byteArray2);
                }
                Set set = nkcVar.l;
                byte[] byteArray3 = set != null ? qw8.toByteArray(xfg.j(set)) : null;
                if (byteArray3 == null) {
                    q36Var.W(12);
                } else {
                    q36Var.k(12, byteArray3);
                }
                q36Var.j(13, nkcVar.m ? 1L : 0L);
                return;
            case 21:
                v52 v52Var = (v52) obj;
                q36Var.j(1, v52Var.a);
                String str36 = v52Var.b;
                if (str36 == null) {
                    q36Var.W(2);
                    return;
                } else {
                    q36Var.f(2, str36);
                    return;
                }
            case 22:
                q36Var.j(1, ((v4d) obj).a);
                q36Var.j(2, au1.s(r1.b));
                return;
            case 23:
                c0e c0eVar = (c0e) obj;
                q36Var.j(1, c0eVar.a);
                q36Var.j(2, zr6.d(c0eVar.b));
                Protos.LogEvent logEvent = new Protos.LogEvent();
                ms7 ms7Var = c0eVar.c;
                logEvent.time = ms7Var.a;
                logEvent.type = ms7Var.c;
                logEvent.event = ms7Var.d;
                Map map3 = ms7Var.e;
                if (map3 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        lz7.R(map3, byteArrayOutputStream);
                        logEvent.params = byteArrayOutputStream.toByteArray();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                logEvent.userId = ms7Var.b;
                logEvent.sessionId = ms7Var.f;
                q36Var.k(3, qw8.toByteArray(logEvent));
                q36Var.j(4, c0eVar.d ? 1L : 0L);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                r3e r3eVar = (r3e) obj;
                q36Var.j(1, r3eVar.a);
                String str37 = r3eVar.b;
                if (str37 == null) {
                    q36Var.W(2);
                } else {
                    q36Var.f(2, str37);
                }
                String str38 = r3eVar.c;
                if (str38 == null) {
                    q36Var.W(3);
                } else {
                    q36Var.f(3, str38);
                }
                q36Var.j(4, r3eVar.d);
                q36Var.j(5, r3eVar.e);
                q36Var.j(6, r3eVar.f);
                String str39 = r3eVar.g;
                if (str39 == null) {
                    q36Var.W(7);
                } else {
                    q36Var.f(7, str39);
                }
                String string3 = new JSONArray((Collection<?>) r3eVar.h).toString();
                if (string3 == null) {
                    q36Var.W(8);
                } else {
                    q36Var.f(8, string3);
                }
                q36Var.j(9, r3eVar.i ? 1L : 0L);
                return;
            case 25:
                u2e u2eVar = (u2e) obj;
                q36Var.j(1, u2eVar.a);
                q36Var.j(2, u2eVar.b);
                q36Var.j(3, u2eVar.c);
                q36Var.j(4, u2eVar.d);
                String str40 = u2eVar.e;
                if (str40 == null) {
                    q36Var.W(5);
                } else {
                    q36Var.f(5, str40);
                }
                q36Var.j(6, u2eVar.f);
                String str41 = u2eVar.g;
                if (str41 == null) {
                    q36Var.W(7);
                } else {
                    q36Var.f(7, str41);
                }
                String str42 = u2eVar.h;
                if (str42 == null) {
                    q36Var.W(8);
                } else {
                    q36Var.f(8, str42);
                }
                String str43 = u2eVar.i;
                if (str43 == null) {
                    q36Var.W(9);
                } else {
                    q36Var.f(9, str43);
                }
                q36Var.f(10, x53.n0(u2eVar.j, ",", null, null, null, 62));
                int i3 = u2eVar.k;
                if (i3 == 1) {
                    i = 0;
                } else if (i3 == 2) {
                    i = 10;
                } else if (i3 == 3) {
                    i = 20;
                } else {
                    if (i3 != 4) {
                        throw null;
                    }
                    i = 40;
                }
                q36Var.j(11, i);
                q36Var.j(12, u2eVar.l);
                String str44 = u2eVar.m;
                if (str44 == null) {
                    q36Var.W(13);
                } else {
                    q36Var.f(13, str44);
                }
                q36Var.j(14, u2eVar.n ? 1L : 0L);
                q36Var.j(15, k7d.c(u2eVar.o));
                String str45 = u2eVar.p;
                if (str45 == null) {
                    q36Var.W(16);
                    return;
                } else {
                    q36Var.f(16, str45);
                    return;
                }
            case 26:
                String str46 = ((cie) obj).a;
                if (str46 == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str46);
                }
                q36Var.j(2, r1.b);
                q36Var.j(3, r1.c);
                return;
            case 27:
                e7f e7fVar = (e7f) obj;
                String str47 = e7fVar.b;
                if (str47 == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str47);
                }
                String str48 = e7fVar.c;
                if (str48 == null) {
                    q36Var.W(2);
                } else {
                    q36Var.f(2, str48);
                }
                String str49 = e7fVar.d;
                if (str49 == null) {
                    q36Var.W(3);
                } else {
                    q36Var.f(3, str49);
                }
                String str50 = e7fVar.e;
                if (str50 == null) {
                    q36Var.W(4);
                } else {
                    q36Var.f(4, str50);
                }
                q36Var.h(5, e7fVar.f);
                q36Var.j(6, e7fVar.g);
                q36Var.j(7, e7fVar.h.a);
                q36Var.j(8, e7fVar.j);
                mx1 mx1Var = e7fVar.a;
                String str51 = (String) mx1Var.c;
                if (str51 == null) {
                    q36Var.W(9);
                } else {
                    q36Var.f(9, str51);
                }
                q36Var.j(10, mx1Var.b);
                q36Var.j(11, au1.s(mx1Var.a));
                o8f o8fVar = e7fVar.i;
                if (o8fVar == null) {
                    q36Var.W(12);
                    q36Var.W(13);
                    return;
                }
                String str52 = o8fVar.a;
                if (str52 == null) {
                    q36Var.W(12);
                } else {
                    q36Var.f(12, str52);
                }
                q36Var.j(13, o8fVar.b);
                return;
            case 28:
                nef nefVar = (nef) obj;
                q36Var.j(1, nefVar.b ? 1L : 0L);
                String str53 = nefVar.c;
                if (str53 == null) {
                    q36Var.W(2);
                } else {
                    q36Var.f(2, str53);
                }
                String str54 = nefVar.d;
                if (str54 == null) {
                    q36Var.W(3);
                } else {
                    q36Var.f(3, str54);
                }
                mef mefVar = nefVar.a;
                String str55 = mefVar.a;
                if (str55 == null) {
                    q36Var.W(4);
                } else {
                    q36Var.f(4, str55);
                }
                q36Var.j(5, mefVar.b.b);
                q36Var.h(6, mefVar.c);
                q36Var.h(7, mefVar.d);
                q36Var.j(8, mefVar.e ? 1L : 0L);
                return;
            default:
                puf pufVar = (puf) obj;
                q36Var.j(1, pufVar.a);
                q36Var.j(2, pufVar.b);
                q36Var.j(3, pufVar.c);
                String str56 = pufVar.d;
                if (str56 == null) {
                    q36Var.W(4);
                } else {
                    q36Var.f(4, str56);
                }
                q36Var.j(5, pufVar.e ? 1L : 0L);
                q36Var.j(6, pufVar.f ? 1L : 0L);
                return;
        }
    }

    @Override // defpackage.v2
    public final String g() {
        switch (this.o) {
            case 0:
                return "INSERT OR REPLACE INTO `animoji` (`id`,`update_time`,`emoji`,`lottie_url`,`lottie_play_url`,`set_id`,`icon_url`) VALUES (?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `animoji_set` (`id`,`name`,`icon_url`,`icon_lottie_url`,`update_time`,`animoji_ids`) VALUES (?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `call_links` (`conversation_id`,`join_link`,`started_at`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `contacts` (`id`,`server_id`,`presence`,`presence_type`,`data`) VALUES (nullif(?, 0),?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `default_emoji` (`emoji`,`default_value`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `draft_uploads` (`path`,`last_modified`,`upload_type`,`chat_id`,`attach_id`,`video_quality`,`video_start_trim_position`,`video_end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `favorite_sticker_sets` (`id`,`index`) VALUES (?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `favorite_stickers` (`id`,`index`) VALUES (?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `fcm_notifications_analytics` (`push_id`,`chat_id`,`msg_id`,`analytics_status`,`suid`,`content_length`,`sent_time`,`event_key`,`fcm_sent_time`,`received_time`,`push_type`,`time`,`created_time`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `fcm_notifications_history` (`chat_id`,`last_notify_msg_id`) VALUES (?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `message_uploads` (`path`,`last_modified`,`upload_type`,`message_id`,`chat_id`,`attach_id`,`video_quality`,`video_start_trim_position`,`video_end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return "INSERT OR REPLACE INTO `fcm_notifications` (`chat_id`,`message_id`,`type`,`chat_title`,`sender_user_name`,`sender_user_id`,`time`,`text`,`push_id`,`event_key`,`large_image_url`,`fire_m`,`has_any_error`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `notifications_read_marks` (`chat_id`,`mark`) VALUES (?,?)";
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return "INSERT OR IGNORE INTO `notifications_tracker_messages` (`chat_id`,`message_id`,`time`,`fcm`,`drop_reason`) VALUES (?,?,?,?,?)";
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return "INSERT OR ABORT INTO `phones` (`id`,`phonebook_id`,`contact_id`,`phone`,`server_phone`,`email`,`first_name`,`last_name`,`avatar_path`,`type`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            case 16:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case LangUtils.HASH_SEED /* 17 */:
                return "INSERT OR REPLACE INTO `profile` (`id`,`server_id`,`profile`) VALUES (nullif(?, 0),?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `reactions_section` (`id`,`update_time`,`reactions`) VALUES (?,?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `recent` (`id`,`recent_type`,`recent_time`,`server_id`,`sticker_id`,`emoji`,`gif`,`gif_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            case 20:
                return "INSERT OR REPLACE INTO `chat_folder` (`id`,`title`,`emoji`,`order`,`filters`,`isHiddenForAllFolder`,`hideIfEmpty`,`elements`,`creatorId`,`filterSubjects`,`widgets`,`options`,`isRemoved`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `folder_and_chats` (`chatId`,`folderId`) VALUES (?,?)";
            case 22:
                return "INSERT OR REPLACE INTO `selected_mentions` (`id`,`selectedMentionType`) VALUES (?,?)";
            case 23:
                return "INSERT OR ABORT INTO `events` (`id`,`status`,`entry`,`isCritical`) VALUES (nullif(?, 0),?,?,?)";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return "INSERT OR REPLACE INTO `sticker_sets` (`id`,`name`,`icon_url`,`author_id`,`created_time`,`updated_time`,`link`,`stickers`,`draft`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 25:
                return "INSERT OR REPLACE INTO `stickers` (`id`,`sticker_id`,`width`,`height`,`url`,`update_time`,`mp4_url`,`first_url`,`preview_url`,`tags`,`sticker_type`,`set_id`,`lottie_url`,`audio`,`author_type`,`video_url`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 26:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 27:
                return "INSERT OR REPLACE INTO `uploads` (`attach_local_id`,`prepared_path`,`file_name`,`upload_url`,`upload_progress`,`total_bytes`,`upload_status`,`created_time`,`path`,`last_modified`,`upload_type`,`photo_token`,`attach_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 28:
                return "INSERT OR REPLACE INTO `video_conversions` (`finished`,`prepared_path`,`result_path`,`source_uri`,`quality`,`start_trim_position`,`end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `webapp_biometry` (`id`,`user_id`,`bot_id`,`token`,`access_requested`,`access_granted`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }
}
