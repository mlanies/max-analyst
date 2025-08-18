package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class tq2 extends dle {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tq2(sla slaVar, int i) {
        super(slaVar);
        this.o = i;
    }

    @Override // defpackage.dle
    public short N() {
        switch (this.o) {
            case 0:
                return sla.k2.a;
            case 1:
                yb9 yb9Var = sla.c;
                return (short) 75;
            case 2:
                yb9 yb9Var2 = sla.c;
                return (short) 55;
            case 3:
                yb9 yb9Var3 = sla.c;
                return (short) 53;
            case 4:
                yb9 yb9Var4 = sla.c;
                return (short) 22;
            case 5:
            case 6:
            case 13:
            case 18:
            case 19:
            case 20:
            case 23:
            case 28:
            default:
                return super.N();
            case 7:
                yb9 yb9Var5 = sla.c;
                return (short) 36;
            case 8:
                yb9 yb9Var6 = sla.c;
                return (short) 39;
            case 9:
                yb9 yb9Var7 = sla.c;
                return (short) 35;
            case 10:
                yb9 yb9Var8 = sla.c;
                return (short) 34;
            case 11:
                return sla.i2.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return sla.h2.a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yb9 yb9Var9 = sla.c;
                return (short) 88;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yb9 yb9Var10 = sla.c;
                return (short) 87;
            case 16:
                yb9 yb9Var11 = sla.c;
                return (short) 124;
            case LangUtils.HASH_SEED /* 17 */:
                yb9 yb9Var12 = sla.c;
                return (short) 179;
            case 21:
                yb9 yb9Var13 = sla.c;
                return (short) 71;
            case 22:
                yb9 yb9Var14 = sla.c;
                return (short) 181;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                yb9 yb9Var15 = sla.c;
                return (short) 178;
            case 25:
                yb9 yb9Var16 = sla.c;
                return (short) 73;
            case 26:
                yb9 yb9Var17 = sla.c;
                return (short) 72;
            case 27:
                yb9 yb9Var18 = sla.c;
                return (short) 118;
            case 29:
                yb9 yb9Var19 = sla.c;
                return (short) 70;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2() {
        super((sla) null);
        this.o = 15;
        e(1, NewHtcHomeBadger.COUNT);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(long j, int i) {
        super((sla) null);
        this.o = 8;
        i(j, "contactId");
        e(50, NewHtcHomeBadger.COUNT);
        if (i != 0) {
            e(i, "from");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(long j, int i, byte b) {
        super((sla) null);
        this.o = i;
        switch (i) {
            case 26:
                super((sla) null);
                if (j != 0) {
                    i(j, ApiProtocol.PARAM_CHAT_ID);
                    break;
                }
                break;
            default:
                i(j, "fileId");
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(long j, int i, String str, boolean z, String str2, HashMap map, String str3, String str4, a20 a20Var, Long l, boolean z2, long j2) {
        String str5;
        super((sla) null);
        this.o = 2;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        if (i != 0) {
            if (i == 1) {
                str5 = "UNKNOWN";
            } else if (i == 2) {
                str5 = "PUBLIC";
            } else {
                if (i != 3) {
                    throw null;
                }
                str5 = "PRIVATE";
            }
            p("access", str5);
        }
        if (!oag.t(str)) {
            p("link", str);
        }
        if (z) {
            d("revokePrivateLink", true);
        }
        if (str2 != null) {
            p("description", str2);
        }
        if (map != null && map.size() > 0) {
            n("options", map);
        }
        if (str3 != null) {
            p("theme", str3);
        }
        if (str4 != null) {
            p("photoToken", str4);
        }
        if (a20Var != null) {
            n("crop", a20Var.a());
        }
        if (l != null) {
            ((HashMap) this.b).put("pinMessageId", l);
            if (z2) {
                d("notifyPin", true);
            }
        }
        if (j2 != 0) {
            i(j2, "changeOwnerId");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(long j, List list) {
        super((sla) null);
        this.o = 21;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        g("messageIds", list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(String str, long j, le3 le3Var, boolean z) {
        super((sla) null);
        this.o = 4;
        if (!oag.t(str)) {
            p("pushToken", str);
        }
        if (j > 0) {
            i(j, "pushOptions");
        }
        if (le3Var != null) {
            us usVar = new us(4);
            String str2 = le3Var.a;
            if (str2 != null) {
                usVar.put("hash", str2);
            }
            Map map = le3Var.c;
            if (map != null) {
                Map map2 = map.isEmpty() ^ true ? map : null;
                if (map2 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(mz7.Z(map2.size()));
                    for (Map.Entry entry : map2.entrySet()) {
                        Object key = entry.getKey();
                        xq2 xq2Var = (xq2) entry.getValue();
                        xq2Var.getClass();
                        us usVar2 = new us(0);
                        usVar2.put("dontDisturbUntil", Long.valueOf(xq2Var.b));
                        Long l = xq2Var.c;
                        if (l != null) {
                            usVar2.put("favIndex", l);
                        }
                        List list = xq2Var.a;
                        if (list != null && !list.isEmpty()) {
                            usVar2.put("sound", Boolean.valueOf(list.contains(jm2.SOUND)));
                            usVar2.put("vibr", Boolean.valueOf(list.contains(jm2.VIBRATION)));
                            usVar2.put("led", Boolean.valueOf(list.contains(jm2.LED)));
                        } else {
                            Boolean bool = Boolean.FALSE;
                            usVar2.put("sound", bool);
                            usVar2.put("vibr", bool);
                            usVar2.put("led", bool);
                        }
                        linkedHashMap.put(key, usVar2);
                    }
                    usVar.put("chats", linkedHashMap);
                }
            }
            gaf gafVar = le3Var.d;
            if (gafVar != null) {
                us usVar3 = new us(0);
                Boolean bool2 = gafVar.a;
                if (bool2 != null) {
                    usVar3.put("PUSH_NEW_CONTACTS", bool2);
                }
                Long l2 = gafVar.b;
                if (l2 != null) {
                    usVar3.put("DONT_DISTURB_UNTIL", l2);
                }
                String str3 = gafVar.c;
                if (str3 != null) {
                    usVar3.put("DIALOGS_PUSH_NOTIFICATION", str3);
                }
                String str4 = gafVar.d;
                if (str4 != null) {
                    usVar3.put("CHATS_PUSH_NOTIFICATION", str4);
                }
                String str5 = gafVar.e;
                if (str5 != null) {
                    usVar3.put("PUSH_SOUND", str5);
                }
                String str6 = gafVar.f;
                if (str6 != null) {
                    usVar3.put("DIALOGS_PUSH_SOUND", str6);
                }
                String str7 = gafVar.g;
                if (str7 != null) {
                    usVar3.put("CHATS_PUSH_SOUND", str7);
                }
                Boolean bool3 = gafVar.h;
                if (bool3 != null) {
                    usVar3.put("HIDDEN", bool3);
                }
                Integer num = gafVar.i;
                if (num != null) {
                    usVar3.put("LED", num);
                }
                Integer num2 = gafVar.j;
                if (num2 != null) {
                    usVar3.put("DIALOGS_LED", num2);
                }
                Integer num3 = gafVar.k;
                if (num3 != null) {
                    usVar3.put("CHATS_LED", num3);
                }
                Boolean bool4 = gafVar.l;
                if (bool4 != null) {
                    usVar3.put("VIBR", bool4);
                }
                Boolean bool5 = gafVar.m;
                if (bool5 != null) {
                    usVar3.put("DIALOGS_VIBR", bool5);
                }
                Boolean bool6 = gafVar.n;
                if (bool6 != null) {
                    usVar3.put("CHATS_VIBR", bool6);
                }
                int i = gafVar.p;
                if (i != 0) {
                    usVar3.put("INCOMING_CALL", h4f.k(i));
                }
                int i2 = gafVar.o;
                if (i2 != 0) {
                    usVar3.put("CHATS_INVITE", h4f.k(i2));
                }
                faf fafVar = gafVar.q;
                if (fafVar != null) {
                    usVar3.put("INACTIVE_TTL", fafVar.a);
                }
                int i3 = gafVar.r;
                if (i3 != 0) {
                    usVar3.put("M_CALL_PUSH_NOTIFICATION", h4f.j(i3));
                }
                int i4 = gafVar.s;
                if (i4 != 0) {
                    usVar3.put("SUGGEST_STICKERS", h4f.l(i4));
                }
                Boolean bool7 = gafVar.t;
                if (bool7 != null) {
                    usVar3.put("AUDIO_TRANSCRIPTION_ENABLED", bool7);
                }
                Boolean bool8 = gafVar.u;
                if (bool8 != null) {
                    usVar3.put("SAFE_MODE", bool8);
                }
                int i5 = gafVar.v;
                if (i5 != 0) {
                    usVar3.put("SEARCH_BY_PHONE", h4f.k(i5));
                }
                Boolean bool9 = gafVar.w;
                if (bool9 != null) {
                    usVar3.put("UNSAFE_FILES", bool9);
                }
                usVar.put("user", usVar3);
            }
            sa2 sa2Var = le3Var.e;
            if (sa2Var != null) {
                usVar.put("chatFolders", br7.f(new kpa("ALL_FILTER_EXCLUDE", x53.D0(sa2Var.a)), new kpa("FOLDERS", x53.D0(sa2Var.b))));
            }
            n("settings", usVar);
        }
        if (z) {
            d("reset", z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(long j, long j2, String str, wz wzVar, ArrayList arrayList, ng4 ng4Var) {
        super(sla.b1);
        this.o = 20;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        i(j2, "messageId");
        if (str != null) {
            p("text", str);
        }
        if (wzVar != null) {
            g("attachments", wzVar);
        }
        if (arrayList != null) {
            g("elements", arrayList);
        }
        if (ng4Var != null) {
            n("delayedAttributes", ng4Var.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(long[] jArr) {
        super(sla.J0);
        this.o = 6;
        h("contactIds", jArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(long j, long j2, lna lnaVar, Boolean bool, long j3) {
        super(sla.Z0);
        this.o = 28;
        if (j != 0) {
            i(j, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j2 != 0) {
            i(j2, "userId");
        }
        n("message", lnaVar.a());
        if (bool != null) {
            ((HashMap) this.b).put("notify", bool);
        }
        if (j3 != 0) {
            i(j3, "lastKnownDraftTime");
        }
    }
}
