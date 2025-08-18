package ru.ok.tamtam.nano;

import defpackage.au1;
import defpackage.cv0;
import defpackage.d92;
import defpackage.er7;
import defpackage.fv0;
import defpackage.hm9;
import defpackage.k8g;
import defpackage.lq9;
import defpackage.lv0;
import defpackage.m20;
import defpackage.nv0;
import defpackage.oag;
import defpackage.s36;
import defpackage.s82;
import defpackage.t82;
import defpackage.tgc;
import defpackage.v10;
import defpackage.vgc;
import defpackage.w10;
import defpackage.wgc;
import defpackage.x10;
import defpackage.x82;
import defpackage.y07;
import defpackage.z07;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public abstract class b {
    public static final byte[] a = new byte[0];

    static {
        s36.d = new lq9();
    }

    public static HashMap a(Map map) {
        HashMap map2 = new HashMap(map.size());
        for (Long l : map.keySet()) {
            Protos.Chat.AdminParticipant adminParticipant = (Protos.Chat.AdminParticipant) map.get(l);
            s82 s82Var = new s82();
            s82Var.b = adminParticipant.id;
            s82Var.a = adminParticipant.permissions;
            s82Var.c = adminParticipant.inviterId;
            s82Var.d = adminParticipant.alias;
            map2.put(l, new t82(s82Var));
        }
        return map2;
    }

    public static int b(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 1 : 6;
        }
        return 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.l20 c(ru.ok.tamtam.nano.Protos.Attaches.Attach r31) {
        /*
            Method dump skipped, instructions count: 1498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.nano.b.c(ru.ok.tamtam.nano.Protos$Attaches$Attach):l20");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ru.ok.tamtam.nano.Protos.Attaches.Attach d(defpackage.l20 r17) {
        /*
            Method dump skipped, instructions count: 1436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.nano.b.d(l20):ru.ok.tamtam.nano.Protos$Attaches$Attach");
    }

    public static k8g e(Protos.Attaches attaches) {
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard;
        m20 m20Var = new m20();
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard2 = attaches.keyboard;
        if (inlineKeyboard2 != null) {
            m20Var.b = k(inlineKeyboard2);
        }
        Protos.Attaches.Attach.ReplyKeyboard replyKeyboard = attaches.replyKeyboard;
        if (replyKeyboard != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                Protos.Attaches.Attach.ReplyButtons[] replyButtonsArr = replyKeyboard.buttons;
                if (i >= replyButtonsArr.length) {
                    break;
                }
                Protos.Attaches.Attach.ReplyButtons replyButtons = replyButtonsArr[i];
                if (replyButtons != null) {
                    arrayList.add(new vgc());
                    int i2 = 0;
                    while (true) {
                        Protos.Attaches.Attach.ReplyButton[] replyButtonArr = replyButtons.replyButton;
                        if (i2 < replyButtonArr.length) {
                            Protos.Attaches.Attach.ReplyButton replyButton = replyButtonArr[i2];
                            if (replyButton != null) {
                                vgc vgcVar = (vgc) arrayList.get(i);
                                int i3 = replyButton.type;
                                int i4 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? 5 : 4 : 3 : 2 : 1;
                                int i5 = replyButton.intent;
                                int i6 = i5 != 0 ? i5 != 1 ? i5 != 2 ? 4 : 3 : 2 : 1;
                                Protos.Attaches.Attach.Photo photo = replyButton.image;
                                vgcVar.add(new tgc(i4, i6, replyButton.text, photo != null ? n(photo) : null, replyButton.outgoingMessageId));
                            }
                            i2++;
                        }
                    }
                }
                i++;
            }
            m20Var.c = new wgc(arrayList, replyKeyboard.defaultInputDisabled);
        }
        for (Protos.Attaches.Attach attach : attaches.attach) {
            if (m20Var.b != null || (inlineKeyboard = attach.inlineKeyboard) == null) {
                m20Var.a(c(attach));
            } else {
                m20Var.b = k(inlineKeyboard);
            }
        }
        return m20Var.c();
    }

    public static Protos.Attaches f(k8g k8gVar) {
        Protos.Attaches attaches = new Protos.Attaches();
        int size = ((List) k8gVar.a).size();
        Protos.Attaches.Attach[] attachArr = new Protos.Attaches.Attach[size];
        for (int i = 0; i < size; i++) {
            attachArr[i] = d(k8gVar.h(i));
        }
        attaches.attach = attachArr;
        z07 z07Var = (z07) k8gVar.b;
        if (z07Var != null) {
            attaches.keyboard = l(z07Var);
        }
        wgc wgcVar = (wgc) k8gVar.c;
        if (wgcVar != null) {
            Protos.Attaches.Attach.ReplyKeyboard replyKeyboard = new Protos.Attaches.Attach.ReplyKeyboard();
            ArrayList arrayList = new ArrayList();
            for (List<tgc> list : wgcVar.a) {
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                for (tgc tgcVar : list) {
                    Protos.Attaches.Attach.ReplyButton replyButton = new Protos.Attaches.Attach.ReplyButton();
                    int iS = au1.s(tgcVar.b);
                    int i2 = 1;
                    replyButton.intent = iS != 0 ? iS != 1 ? iS != 2 ? 3 : 2 : 1 : 0;
                    int iS2 = au1.s(tgcVar.a);
                    if (iS2 == 0) {
                        i2 = 0;
                    } else if (iS2 != 1) {
                        i2 = iS2 != 2 ? 3 : 2;
                    }
                    replyButton.type = i2;
                    String str = tgcVar.c;
                    if (str == null) {
                        str = "";
                    }
                    replyButton.text = str;
                    replyButton.outgoingMessageId = tgcVar.e;
                    x10 x10Var = tgcVar.d;
                    if (x10Var != null) {
                        replyButton.image = o(x10Var);
                    }
                    arrayList2.add(replyButton);
                }
            }
            Protos.Attaches.Attach.ReplyButtons[] replyButtonsArr = new Protos.Attaches.Attach.ReplyButtons[arrayList.size()];
            Protos.Attaches.Attach.ReplyButton[] replyButtonArr = new Protos.Attaches.Attach.ReplyButton[0];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Protos.Attaches.Attach.ReplyButtons replyButtons = new Protos.Attaches.Attach.ReplyButtons();
                replyButtons.replyButton = (Protos.Attaches.Attach.ReplyButton[]) ((List) arrayList.get(i3)).toArray(replyButtonArr);
                replyButtonsArr[i3] = replyButtons;
            }
            replyKeyboard.buttons = replyButtonsArr;
            replyKeyboard.defaultInputDisabled = wgcVar.b;
            attaches.replyKeyboard = replyKeyboard;
        }
        return attaches;
    }

    public static x82 g(Protos.Chat.ChatMedia chatMedia) {
        int i = chatMedia.totalCount;
        long j = chatMedia.firstMessageId;
        long j2 = chatMedia.lastMessageId;
        Protos.Chat.Chunk chunk = chatMedia.chunk;
        ArrayList arrayList = null;
        d92 d92VarI = chunk != null ? i(chunk) : null;
        Protos.Chat.Chunk[] chunkArr = chatMedia.chunks;
        if (chunkArr != null && chunkArr.length > 0) {
            for (Protos.Chat.Chunk chunk2 : chunkArr) {
                d92 d92VarI2 = i(chunk2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(d92VarI2);
            }
        }
        return new x82(d92VarI, i, j, j2, arrayList == null ? Collections.emptyList() : arrayList);
    }

    public static Protos.Chat.ChatMedia h(x82 x82Var) {
        Protos.Chat.ChatMedia chatMedia = new Protos.Chat.ChatMedia();
        chatMedia.firstMessageId = x82Var.c;
        chatMedia.lastMessageId = x82Var.d;
        chatMedia.totalCount = x82Var.b;
        d92 d92Var = x82Var.a;
        if (d92Var != null) {
            chatMedia.chunk = j(d92Var);
        }
        List list = x82Var.e;
        if (list.size() > 0) {
            chatMedia.chunks = new Protos.Chat.Chunk[list.size()];
            for (int i = 0; i < list.size(); i++) {
                chatMedia.chunks[i] = j((d92) list.get(i));
            }
        }
        return chatMedia;
    }

    public static d92 i(Protos.Chat.Chunk chunk) {
        long j = chunk.startTime;
        if (j == -1) {
            hm9.l0("Chunk.Builder", "", new IllegalStateException("start time is -1"));
        }
        long j2 = chunk.endTime;
        if (j2 == -1) {
            hm9.l0("Chunk.Builder", "", new IllegalStateException("end time is -1"));
        }
        return new d92(j, j2);
    }

    public static Protos.Chat.Chunk j(d92 d92Var) {
        Protos.Chat.Chunk chunk = new Protos.Chat.Chunk();
        chunk.startTime = d92Var.a;
        chunk.endTime = d92Var.b;
        return chunk;
    }

    public static z07 k(Protos.Attaches.Attach.InlineKeyboard inlineKeyboard) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            Protos.Attaches.Attach.Buttons[] buttonsArr = inlineKeyboard.buttons;
            if (i >= buttonsArr.length) {
                int i2 = z07.c;
                y07 y07Var = new y07();
                y07Var.a = arrayList;
                y07Var.b = inlineKeyboard.callbackId;
                return new z07(y07Var);
            }
            Protos.Attaches.Attach.Buttons buttons = buttonsArr[i];
            arrayList.add(new lv0());
            int i3 = 0;
            while (true) {
                Protos.Attaches.Attach.Button[] buttonArr = buttons.button;
                if (i3 < buttonArr.length) {
                    Protos.Attaches.Attach.Button button = buttonArr[i3];
                    lv0 lv0Var = (lv0) arrayList.get(i);
                    int i4 = button.type;
                    int i5 = 3;
                    nv0 nv0Var = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 5 ? i4 != 6 ? i4 != 7 ? nv0.UNKNOWN : nv0.OPEN_APP : nv0.MESSAGE : nv0.CHAT : nv0.REQUEST_GEO_LOCATION : nv0.REQUEST_CONTACT : nv0.LINK : nv0.CALLBACK;
                    int i6 = button.intent;
                    if (i6 == 0) {
                        i5 = 1;
                    } else if (i6 == 1) {
                        i5 = 2;
                    } else if (i6 != 2) {
                        i5 = 4;
                    }
                    String str = button.title;
                    String str2 = button.url;
                    String str3 = button.payload;
                    boolean z = button.quickLocation;
                    long j = button.contactId;
                    boolean z2 = button.showLoading;
                    cv0 cv0Var = new cv0(str, nv0Var, i5);
                    cv0Var.d = str2;
                    cv0Var.e = str3;
                    cv0Var.h = j;
                    cv0Var.f = z;
                    cv0Var.g = z2;
                    lv0Var.add(new fv0(cv0Var));
                    i3++;
                    i = i;
                }
            }
            i++;
        }
    }

    public static Protos.Attaches.Attach.InlineKeyboard l(z07 z07Var) {
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard = new Protos.Attaches.Attach.InlineKeyboard();
        List list = z07Var.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Protos.Attaches.Attach.Buttons[] buttonsArr = new Protos.Attaches.Attach.Buttons[arrayList.size()];
                Protos.Attaches.Attach.Button[] buttonArr = new Protos.Attaches.Attach.Button[0];
                for (int i = 0; i < arrayList.size(); i++) {
                    Protos.Attaches.Attach.Buttons buttons = new Protos.Attaches.Attach.Buttons();
                    buttons.button = (Protos.Attaches.Attach.Button[]) ((List) arrayList.get(i)).toArray(buttonArr);
                    buttonsArr[i] = buttons;
                }
                inlineKeyboard.buttons = buttonsArr;
                String str = z07Var.b;
                inlineKeyboard.callbackId = str != null ? str : "";
                return inlineKeyboard;
            }
            List<fv0> list2 = (List) it.next();
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(arrayList2);
            for (fv0 fv0Var : list2) {
                Protos.Attaches.Attach.Button button = new Protos.Attaches.Attach.Button();
                int iS = au1.s(fv0Var.c);
                int i2 = 1;
                button.intent = iS != 0 ? iS != 1 ? iS != 2 ? 3 : 2 : 1 : 0;
                switch (fv0Var.b) {
                    case CALLBACK:
                        i2 = 0;
                        break;
                    case LINK:
                        break;
                    case REQUEST_CONTACT:
                        i2 = 2;
                        break;
                    case REQUEST_GEO_LOCATION:
                        i2 = 3;
                        break;
                    case CHAT:
                        i2 = 5;
                        break;
                    case OPEN_APP:
                        i2 = 7;
                        break;
                    case MESSAGE:
                        i2 = 6;
                        break;
                    default:
                        i2 = 4;
                        break;
                }
                button.type = i2;
                String str2 = fv0Var.a;
                if (str2 == null) {
                    str2 = "";
                }
                button.title = str2;
                String str3 = fv0Var.o;
                if (str3 == null) {
                    str3 = "";
                }
                button.url = str3;
                String str4 = fv0Var.X;
                if (str4 == null) {
                    str4 = "";
                }
                button.payload = str4;
                button.showLoading = fv0Var.s0;
                button.quickLocation = fv0Var.Y;
                button.contactId = fv0Var.Z;
                arrayList2.add(button);
            }
        }
    }

    public static Protos.Attaches.LocationInfo m(v10 v10Var) {
        Protos.Attaches.LocationInfo locationInfo = new Protos.Attaches.LocationInfo();
        er7 er7Var = v10Var.a;
        locationInfo.latitude = er7Var.a;
        locationInfo.longitude = er7Var.b;
        locationInfo.altitude = er7Var.c;
        locationInfo.accuracy = er7Var.o;
        locationInfo.bearing = er7Var.X;
        locationInfo.speed = er7Var.Y;
        locationInfo.time = v10Var.b;
        return locationInfo;
    }

    public static x10 n(Protos.Attaches.Attach.Photo photo) {
        x10 x10Var = x10.w0;
        w10 w10Var = new w10();
        w10Var.a = photo.baseUrl;
        w10Var.b = photo.photoUrl;
        w10Var.c = photo.width;
        w10Var.d = photo.height;
        w10Var.e = photo.gif;
        w10Var.f = photo.previewData;
        w10Var.g = photo.photoToken;
        w10Var.h = photo.photoId;
        w10Var.i = photo.mp4Url;
        w10Var.k = oag.t(photo.previewUrl) ? null : photo.previewUrl;
        w10Var.j = photo.externalGifId;
        return w10Var.a();
    }

    public static Protos.Attaches.Attach.Photo o(x10 x10Var) {
        Protos.Attaches.Attach.Photo photo = new Protos.Attaches.Attach.Photo();
        String str = x10Var.a;
        if (str == null) {
            str = "";
        }
        photo.baseUrl = str;
        String str2 = x10Var.b;
        if (str2 == null) {
            str2 = "";
        }
        photo.photoUrl = str2;
        photo.width = x10Var.c;
        photo.height = x10Var.o;
        photo.gif = x10Var.X;
        byte[] bArr = x10Var.Y;
        if (bArr != null) {
            photo.previewData = bArr;
        }
        String str3 = x10Var.v0;
        if (str3 == null) {
            str3 = "";
        }
        photo.previewUrl = str3;
        String str4 = x10Var.Z;
        if (str4 == null) {
            str4 = "";
        }
        photo.photoToken = str4;
        photo.photoId = x10Var.s0;
        String str5 = x10Var.t0;
        if (str5 == null) {
            str5 = "";
        }
        photo.mp4Url = str5;
        String str6 = x10Var.u0;
        photo.externalGifId = str6 != null ? str6 : "";
        return photo;
    }

    public static int p(int i) {
        int iS = au1.s(i);
        int i2 = 1;
        if (iS != 1) {
            i2 = 2;
            if (iS != 2) {
                i2 = 3;
                if (iS != 3) {
                    i2 = 4;
                    if (iS != 4) {
                        i2 = 5;
                        if (iS != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }
}
