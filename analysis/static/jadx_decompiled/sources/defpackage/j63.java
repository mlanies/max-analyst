package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class j63 {
    public static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap map = new HashMap();
        d = map;
        ms2.i(-984833, map, "aliceblue", -332841, "antiquewhite");
        ms2.l(map, "aqua", -16711681, -8388652, "aquamarine");
        ms2.i(-983041, map, "azure", -657956, "beige");
        ms2.i(-6972, map, "bisque", -16777216, "black");
        ms2.i(-5171, map, "blanchedalmond", -16776961, "blue");
        ms2.i(-7722014, map, "blueviolet", -5952982, "brown");
        ms2.i(-2180985, map, "burlywood", -10510688, "cadetblue");
        ms2.i(-8388864, map, "chartreuse", -2987746, "chocolate");
        ms2.i(-32944, map, "coral", -10185235, "cornflowerblue");
        ms2.i(-1828, map, "cornsilk", -2354116, "crimson");
        ms2.l(map, "cyan", -16711681, -16777077, "darkblue");
        ms2.i(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        ms2.l(map, "darkgray", -5658199, -16751616, "darkgreen");
        ms2.l(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        ms2.i(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        ms2.i(-29696, map, "darkorange", -6737204, "darkorchid");
        ms2.i(-7667712, map, "darkred", -1468806, "darksalmon");
        ms2.i(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        ms2.l(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        ms2.i(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        ms2.l(map, "dodgerblue", -14774017, -5103070, "firebrick");
        ms2.i(-1296, map, "floralwhite", -14513374, "forestgreen");
        ms2.l(map, "fuchsia", -65281, -2302756, "gainsboro");
        ms2.i(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        ms2.i(-16744448, map, "green", -5374161, "greenyellow");
        ms2.l(map, "grey", -8355712, -983056, "honeydew");
        ms2.i(-38476, map, "hotpink", -3318692, "indianred");
        ms2.i(-11861886, map, "indigo", -16, "ivory");
        ms2.i(-989556, map, "khaki", -1644806, "lavender");
        ms2.i(-3851, map, "lavenderblush", -8586240, "lawngreen");
        ms2.i(-1331, map, "lemonchiffon", -5383962, "lightblue");
        ms2.i(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        ms2.i(-18751, map, "lightpink", -24454, "lightsalmon");
        ms2.i(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        ms2.l(map, "lightsteelblue", -5192482, -32, "lightyellow");
        ms2.i(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        ms2.i(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        ms2.i(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        ms2.i(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        ms2.i(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        ms2.i(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        ms2.i(-15132304, map, "midnightblue", -655366, "mintcream");
        ms2.i(-6943, map, "mistyrose", -6987, "moccasin");
        ms2.i(-8531, map, "navajowhite", -16777088, "navy");
        ms2.i(-133658, map, "oldlace", -8355840, "olive");
        ms2.i(-9728477, map, "olivedrab", -23296, "orange");
        ms2.i(-47872, map, "orangered", -2461482, "orchid");
        ms2.i(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        ms2.i(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        ms2.i(-4139, map, "papayawhip", -9543, "peachpuff");
        ms2.i(-3308225, map, "peru", -16181, "pink");
        ms2.i(-2252579, map, "plum", -5185306, "powderblue");
        ms2.i(-8388480, map, "purple", -10079335, "rebeccapurple");
        ms2.i(-65536, map, "red", -4419697, "rosybrown");
        ms2.i(-12490271, map, "royalblue", -7650029, "saddlebrown");
        ms2.i(-360334, map, "salmon", -744352, "sandybrown");
        ms2.i(-13726889, map, "seagreen", -2578, "seashell");
        ms2.i(-6270419, map, "sienna", -4144960, "silver");
        ms2.i(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        ms2.l(map, "snow", -1286, -16711809, "springgreen");
        ms2.i(-12156236, map, "steelblue", -2968436, "tan");
        ms2.i(-16744320, map, "teal", -2572328, "thistle");
        ms2.i(-40121, map, "tomato", 0, "transparent");
        ms2.i(-12525360, map, "turquoise", -1146130, "violet");
        ms2.i(-663885, map, "wheat", -1, "white");
        ms2.i(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z) throws NumberFormatException {
        int i;
        np8.d(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? c : b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) d.get(lz7.T(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
