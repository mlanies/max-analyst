package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final class pl3 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final nl3 i;
    public final int j;
    public final ol3 k;
    public final int l;
    public final int m;
    public final List n;
    public final String o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final long t;
    public final kl3 u;
    public final int[] v;
    public final ml3 w;

    public pl3(hl3 hl3Var) {
        this.a = hl3Var.a;
        this.b = hl3Var.d;
        this.c = hl3Var.b;
        this.d = hl3Var.c;
        this.e = hl3Var.e;
        ArrayList arrayList = new ArrayList(hl3Var.f);
        arrayList.removeIf(new fl3(0));
        arrayList.sort(Comparator.comparing(new gl3(0)));
        this.f = Collections.unmodifiableList(arrayList);
        this.g = hl3Var.g;
        this.h = hl3Var.h;
        this.i = hl3Var.i;
        this.j = hl3Var.j;
        this.k = hl3Var.k;
        this.l = hl3Var.l;
        this.m = hl3Var.m;
        this.n = hl3Var.n;
        this.o = hl3Var.o;
        this.p = hl3Var.p;
        this.q = hl3Var.q;
        this.r = hl3Var.r;
        this.s = hl3Var.s;
        this.t = hl3Var.t;
        this.u = hl3Var.u;
        this.v = hl3Var.v;
        this.w = hl3Var.w;
    }

    public static pl3 b(byte[] bArr) throws ProtoException {
        ol3 ol3Var;
        int i;
        byte[] bArr2 = b.a;
        try {
            Protos.Contact contact = (Protos.Contact) qw8.mergeFrom(new Protos.Contact(), bArr);
            hl3 hl3Var = new hl3();
            hl3Var.a = contact.serverId;
            hl3Var.b = contact.baseUrl;
            hl3Var.c = contact.baseRawUrl;
            hl3Var.d = contact.deviceAvatarUrl;
            hl3Var.e = contact.photoId;
            hl3Var.g = contact.lastUpdateTime;
            hl3Var.h = contact.serverPhone;
            hl3Var.m = contact.settings;
            hl3Var.o = contact.description;
            hl3Var.p = contact.link;
            hl3Var.q = contact.birthday;
            hl3Var.r = contact.lastSearchClickTime;
            hl3Var.s = contact.lastSyncTime;
            hl3Var.t = contact.lastShowingUnknownContactBar;
            hl3Var.v = contact.profileOptions;
            Protos.Contact.MenuButton menuButton = contact.menuButton;
            hl3Var.u = menuButton == null ? null : new kl3(menuButton.text);
            Protos.Contact.StartMessage startMessage = contact.startMessage;
            if (startMessage != null) {
                String str = startMessage.text;
                Protos.MessageElement[] messageElementArr = startMessage.elements;
                ArrayList arrayListA = (messageElementArr == null || messageElementArr.length <= 0) ? null : ou8.a(messageElementArr);
                Protos.Attaches.Attach attach = contact.startMessage.media;
                l20 l20VarC = attach != null ? b.c(attach) : null;
                if (str != null) {
                    hl3Var.w = new ml3(l20VarC, str, arrayListA);
                }
            }
            ArrayList arrayList = new ArrayList();
            Protos.Contact.ContactName[] contactNameArr = contact.names;
            if (contactNameArr != null && contactNameArr.length > 0) {
                for (Protos.Contact.ContactName contactName : contactNameArr) {
                    String str2 = contactName.name;
                    String str3 = contactName.lastName;
                    il3 il3Var = il3.o;
                    int i2 = contactName.type;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            il3Var = il3.a;
                        } else if (i2 == 2) {
                            il3Var = il3.b;
                        } else if (i2 == 3) {
                            il3Var = il3.c;
                        }
                    }
                    arrayList.add(new jl3(str2, il3Var, str3));
                }
            }
            hl3Var.f = arrayList;
            int i3 = contact.status;
            hl3Var.i = i3 != 1 ? i3 != 2 ? null : nl3.b : nl3.a;
            int i4 = contact.type;
            if (i4 == 0) {
                ol3Var = ol3.a;
            } else {
                if (i4 != 1) {
                    throw new IllegalArgumentException("unknown proto.type " + contact.type);
                }
                ol3Var = ol3.b;
            }
            hl3Var.k = ol3Var;
            int i5 = contact.gender;
            if (i5 == 0) {
                i = 1;
            } else if (i5 == 1) {
                i = 2;
            } else {
                if (i5 != 2) {
                    throw new IllegalArgumentException("unknown proto.gender " + contact.gender);
                }
                i = 3;
            }
            hl3Var.l = i;
            ArrayList arrayList2 = new ArrayList();
            int[] iArr = contact.options;
            if (iArr != null && iArr.length > 0) {
                int length = iArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    int i7 = iArr[i6];
                    arrayList2.add(i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? null : ll3.o : ll3.c : ll3.b : ll3.a);
                }
            }
            hl3Var.n = arrayList2;
            return hl3Var.a();
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }

    public final boolean a() {
        List list = this.f;
        if (list.isEmpty()) {
            return true;
        }
        return ((jl3) list.get(0)).equals(jl3.e);
    }

    public final hl3 c() {
        hl3 hl3Var = new hl3();
        hl3Var.a = this.a;
        hl3Var.b = this.c;
        hl3Var.c = this.d;
        hl3Var.d = this.b;
        hl3Var.e = this.e;
        hl3Var.f = new ArrayList(this.f);
        hl3Var.g = this.g;
        hl3Var.h = this.h;
        hl3Var.i = this.i;
        hl3Var.k = this.k;
        hl3Var.l = this.l;
        hl3Var.m = this.m;
        hl3Var.n = new ArrayList(this.n);
        hl3Var.o = this.o;
        hl3Var.p = this.p;
        hl3Var.q = this.q;
        hl3Var.r = this.r;
        hl3Var.s = this.s;
        hl3Var.t = this.t;
        hl3Var.u = this.u;
        hl3Var.v = this.v;
        return hl3Var;
    }

    public final byte[] d() {
        int i;
        int i2;
        byte[] bArr = b.a;
        Protos.Contact contact = new Protos.Contact();
        contact.serverId = this.a;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        contact.baseUrl = str;
        String str2 = this.d;
        if (str2 == null) {
            str2 = "";
        }
        contact.baseRawUrl = str2;
        String str3 = this.b;
        if (str3 == null) {
            str3 = "";
        }
        contact.deviceAvatarUrl = str3;
        contact.photoId = this.e;
        contact.lastUpdateTime = this.g;
        contact.serverPhone = this.h;
        contact.settings = this.m;
        String str4 = this.o;
        if (str4 == null) {
            str4 = "";
        }
        contact.description = str4;
        String str5 = this.p;
        if (str5 == null) {
            str5 = "";
        }
        contact.link = str5;
        String str6 = this.q;
        if (str6 == null) {
            str6 = "";
        }
        contact.birthday = str6;
        contact.lastSearchClickTime = this.r;
        contact.lastSyncTime = this.s;
        contact.lastShowingUnknownContactBar = this.t;
        contact.profileOptions = this.v;
        List list = this.f;
        if (!list.isEmpty()) {
            int size = list.size();
            contact.names = new Protos.Contact.ContactName[size];
            for (int i3 = 0; i3 < size; i3++) {
                jl3 jl3Var = (jl3) list.get(i3);
                Protos.Contact.ContactName contactName = new Protos.Contact.ContactName();
                String str7 = jl3Var.a;
                if (str7 == null) {
                    str7 = "";
                }
                contactName.name = str7;
                String str8 = jl3Var.b;
                if (str8 == null) {
                    str8 = "";
                }
                contactName.lastName = str8;
                int iOrdinal = jl3Var.c.ordinal();
                if (iOrdinal == 0) {
                    i2 = 1;
                } else if (iOrdinal == 1) {
                    i2 = 2;
                } else if (iOrdinal == 2) {
                    i2 = 3;
                } else {
                    if (iOrdinal != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                    i2 = 0;
                }
                contactName.type = i2;
                contact.names[i3] = contactName;
            }
        }
        nl3 nl3Var = this.i;
        if (nl3Var == null) {
            contact.status = 0;
        } else if (nl3Var == nl3.a) {
            contact.status = 1;
        } else {
            if (nl3Var != nl3.b) {
                throw new IllegalArgumentException("unknown status " + nl3Var);
            }
            contact.status = 2;
        }
        int iOrdinal2 = this.k.ordinal();
        if (iOrdinal2 == 0) {
            contact.type = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new IllegalArgumentException("unknown type");
            }
            contact.type = 1;
        }
        int iS = au1.s(this.l);
        if (iS == 0) {
            contact.gender = 0;
        } else if (iS == 1) {
            contact.gender = 1;
        } else {
            if (iS != 2) {
                throw new IllegalArgumentException("unknown type");
            }
            contact.gender = 2;
        }
        kl3 kl3Var = this.u;
        if (kl3Var != null) {
            Protos.Contact.MenuButton menuButton = new Protos.Contact.MenuButton();
            String str9 = kl3Var.a;
            if (str9 == null) {
                str9 = "";
            }
            menuButton.text = str9;
            contact.menuButton = menuButton;
        }
        List list2 = this.n;
        if (!list2.isEmpty()) {
            contact.options = new int[list2.size()];
            for (int i4 = 0; i4 < contact.options.length; i4++) {
                int iOrdinal3 = ((ll3) list2.get(i4)).ordinal();
                if (iOrdinal3 == 0) {
                    i = 0;
                } else if (iOrdinal3 == 1) {
                    i = 1;
                } else if (iOrdinal3 == 2) {
                    i = 2;
                } else {
                    if (iOrdinal3 != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                    i = 3;
                }
                contact.options[i4] = i;
            }
        }
        ml3 ml3Var = this.w;
        if (ml3Var != null) {
            Protos.Contact.StartMessage startMessage = new Protos.Contact.StartMessage();
            String str10 = ml3Var.b;
            startMessage.text = str10 != null ? str10 : "";
            l20 l20Var = ml3Var.a;
            if (l20Var != null) {
                startMessage.media = b.d(l20Var);
            } else {
                startMessage.media = null;
            }
            List list3 = ml3Var.c;
            if (list3 != null) {
                startMessage.elements = ou8.c(list3).elements;
            } else {
                startMessage.elements = null;
            }
            contact.startMessage = startMessage;
        }
        return qw8.toByteArray(contact);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pl3.class.getSimpleName());
        sb.append("{serverId=");
        sb.append(this.a);
        sb.append(",baseUrl=");
        sb.append(this.c);
        sb.append(",names=");
        sb.append(this.f);
        sb.append(",type=");
        sb.append(this.k);
        sb.append(",options=");
        sb.append(this.n);
        sb.append(",lastSyncTime=");
        return zr6.k(sb, this.s, "}");
    }
}
