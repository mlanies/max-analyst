package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.HTTP;

/* loaded from: classes2.dex */
public final class dcg {
    public static final Pattern e = Pattern.compile("^a=(?:rtcp-fb|fmtp):(\\d+) (apt=(\\d+))?.*$");
    public static final Pattern f = Pattern.compile("^a=rtpmap:(\\d+) ([a-zA-Z0-9-]+)(/\\d+)+[\r]?$");
    public final HashSet a;
    public final String b;
    public final int c;
    public final LinkedHashMap d;

    public dcg(String str, int i, LinkedHashMap linkedHashMap) {
        this.b = str;
        this.c = i;
        this.d = linkedHashMap;
        this.a = new HashSet(linkedHashMap.size() * 7);
    }

    public static dcg a(int i, String str) {
        List listAsList = Arrays.asList(str.split(" "));
        if (listAsList.size() <= 3) {
            return null;
        }
        listAsList.subList(0, 3);
        ArrayList arrayList = new ArrayList(listAsList.subList(3, listAsList.size()));
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size(), 2.0f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            linkedHashMap.put(str2, new xbg(str2));
        }
        return new dcg(str, i, linkedHashMap);
    }

    public final ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        for (xbg xbgVar : this.d.values()) {
            if (Objects.equals(str, xbgVar.b)) {
                arrayList.add(xbgVar);
            }
        }
        return arrayList;
    }

    public final void c(StringBuilder sb, List list, boolean z) {
        boolean zD = d(list);
        LinkedHashMap linkedHashMap = this.d;
        if (!zD && !z) {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((xbg) it.next()).c.iterator();
                while (it2.hasNext()) {
                    sb.append((String) it2.next());
                    sb.append(HTTP.CRLF);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Iterator it4 = b((String) it3.next()).iterator();
            while (it4.hasNext()) {
                xbg xbgVar = (xbg) it4.next();
                Iterator it5 = xbgVar.c.iterator();
                while (it5.hasNext()) {
                    sb.append((String) it5.next());
                    sb.append(HTTP.CRLF);
                }
                Iterator it6 = xbgVar.d.iterator();
                while (it6.hasNext()) {
                    String str = (String) it6.next();
                    xbg xbgVar2 = (xbg) linkedHashMap.get(str);
                    if (xbgVar2 != null) {
                        Iterator it7 = xbgVar2.c.iterator();
                        while (it7.hasNext()) {
                            sb.append((String) it7.next());
                            sb.append(HTTP.CRLF);
                        }
                        arrayList.add(str);
                    }
                }
            }
        }
        if (z) {
            return;
        }
        for (xbg xbgVar3 : linkedHashMap.values()) {
            if (!list.contains(xbgVar3.b) && !arrayList.contains(xbgVar3.a)) {
                Iterator it8 = xbgVar3.c.iterator();
                while (it8.hasNext()) {
                    sb.append((String) it8.next());
                    sb.append(HTTP.CRLF);
                }
            }
        }
    }

    public final boolean d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next()).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i, String str) {
        xbg xbgVar;
        xbg xbgVar2;
        xbg xbgVar3;
        if (str.startsWith("a=")) {
            Matcher matcher = e.matcher(str);
            boolean zMatches = matcher.matches();
            HashSet hashSet = this.a;
            LinkedHashMap linkedHashMap = this.d;
            if (zMatches) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(3);
                if (strGroup2 != null && (xbgVar3 = (xbg) linkedHashMap.get(strGroup2)) != null) {
                    xbgVar3.d.add(strGroup);
                }
                if (strGroup == null || (xbgVar2 = (xbg) linkedHashMap.get(strGroup)) == null) {
                    return;
                }
                xbgVar2.c.add(str);
                hashSet.add(Integer.valueOf(i));
                return;
            }
            Matcher matcher2 = f.matcher(str);
            if (matcher2.matches()) {
                String strGroup3 = matcher2.group(1);
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null || strGroup3 == null || (xbgVar = (xbg) linkedHashMap.get(strGroup3)) == null) {
                    return;
                }
                xbgVar.b = strGroup4;
                xbg xbgVar4 = (xbg) linkedHashMap.get(strGroup3);
                if (xbgVar4 == null) {
                    return;
                }
                xbgVar4.c.add(str);
                hashSet.add(Integer.valueOf(i));
            }
        }
    }

    public final void f(StringBuilder sb, List list, boolean z) {
        boolean zD = d(list);
        String str = this.b;
        if (!zD && !z) {
            sb.append(str);
            sb.append(HTTP.CRLF);
            return;
        }
        List listSubList = Arrays.asList(str.split(" ")).subList(0, 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(' ');
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Iterator it3 = b((String) it2.next()).iterator();
            while (it3.hasNext()) {
                xbg xbgVar = (xbg) it3.next();
                sb.append(xbgVar.a);
                sb.append(' ');
                Iterator it4 = xbgVar.d.iterator();
                while (it4.hasNext()) {
                    String str2 = (String) it4.next();
                    sb.append(str2);
                    sb.append(' ');
                    arrayList.add(str2);
                }
            }
        }
        if (!z) {
            for (xbg xbgVar2 : this.d.values()) {
                if (!list.contains(xbgVar2.b)) {
                    String str3 = xbgVar2.a;
                    if (!arrayList.contains(str3)) {
                        sb.append(str3);
                        sb.append(' ');
                    }
                }
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(HTTP.CRLF);
    }
}
