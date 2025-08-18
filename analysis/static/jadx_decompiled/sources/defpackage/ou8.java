package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public abstract class ou8 {
    public static final /* synthetic */ int a = 0;

    public static ArrayList a(Protos.MessageElement[] messageElementArr) {
        mu8 mu8Var;
        mu8 mu8Var2;
        ArrayList arrayList = new ArrayList();
        for (Protos.MessageElement messageElement : messageElementArr) {
            int i = messageElement.type;
            Map mapSingletonMap = null;
            switch (i) {
                case 0:
                    mu8Var = mu8.a;
                    mu8Var2 = mu8Var;
                    break;
                case 1:
                    mu8Var = mu8.b;
                    mu8Var2 = mu8Var;
                    break;
                case 2:
                    mu8Var = mu8.o;
                    mu8Var2 = mu8Var;
                    break;
                case 3:
                    mu8Var = mu8.c;
                    mu8Var2 = mu8Var;
                    break;
                case 4:
                    mu8Var = mu8.X;
                    mu8Var2 = mu8Var;
                    break;
                case 5:
                    mu8Var = mu8.Y;
                    mu8Var2 = mu8Var;
                    break;
                case 6:
                    mu8Var = mu8.Z;
                    mu8Var2 = mu8Var;
                    break;
                case 7:
                    mu8Var = mu8.t0;
                    mu8Var2 = mu8Var;
                    break;
                case 8:
                    mu8Var = mu8.u0;
                    mu8Var2 = mu8Var;
                    break;
                case 9:
                    mu8Var = mu8.s0;
                    mu8Var2 = mu8Var;
                    break;
                case 10:
                    mu8Var = mu8.v0;
                    mu8Var2 = mu8Var;
                    break;
                default:
                    Locale locale = Locale.ENGLISH;
                    hm9.p("ou8", "Unknown protoElement type = " + i, null);
                    mu8Var2 = null;
                    break;
            }
            long j = messageElement.entityId;
            String str = oag.t(messageElement.entityName) ? null : messageElement.entityName;
            int i2 = messageElement.from;
            int i3 = messageElement.length;
            Protos.MessageElement.LinkAttributes linkAttributes = messageElement.linkAttributes;
            if (linkAttributes != null) {
                mapSingletonMap = Collections.singletonMap("url", linkAttributes.url);
            }
            arrayList.add(new nu8(j, str, mu8Var2, i2, i3, mapSingletonMap));
        }
        return arrayList;
    }

    public static byte[] b(List list) {
        return qw8.toByteArray(c(list));
    }

    public static Protos.MessageElements c(List list) {
        Protos.MessageElements messageElements = new Protos.MessageElements();
        messageElements.elements = new Protos.MessageElement[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nu8 nu8Var = (nu8) list.get(i);
            Protos.MessageElement messageElement = new Protos.MessageElement();
            messageElement.entityId = nu8Var.a;
            byte[] bArr = b.a;
            String str = nu8Var.b;
            if (str == null) {
                str = "";
            }
            messageElement.entityName = str;
            messageElement.from = nu8Var.d;
            messageElement.length = nu8Var.e;
            switch (nu8Var.c.ordinal()) {
                case 0:
                    messageElement.type = 0;
                    break;
                case 1:
                    messageElement.type = 1;
                    break;
                case 2:
                    messageElement.type = 3;
                    break;
                case 3:
                    messageElement.type = 2;
                    break;
                case 4:
                    messageElement.type = 4;
                    break;
                case 5:
                    messageElement.type = 5;
                    Map map = nu8Var.f;
                    if (!map.containsKey("url")) {
                        throw new IllegalStateException("There are not enough attributes for the type = LINK");
                    }
                    Protos.MessageElement.LinkAttributes linkAttributes = new Protos.MessageElement.LinkAttributes();
                    messageElement.linkAttributes = linkAttributes;
                    linkAttributes.url = (String) map.get("url");
                    break;
                case 6:
                    messageElement.type = 6;
                    break;
                case 7:
                    messageElement.type = 9;
                    break;
                case 8:
                    messageElement.type = 7;
                    break;
                case 9:
                    messageElement.type = 8;
                    break;
                case 10:
                    messageElement.type = 10;
                    break;
            }
            messageElements.elements[i] = messageElement;
        }
        return messageElements;
    }
}
