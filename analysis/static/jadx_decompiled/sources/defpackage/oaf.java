package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.util.LangUtils;
import org.webrtc.MediaStreamTrack;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class oaf {
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    public static final long[] g;
    public static final Pattern h;
    public static final Pattern i;
    public static final Pattern j;
    public static final Pattern k;
    public static HashMap l;
    public static final String[] m;
    public static final String[] n;
    public static final int[] o;
    public static final int[] p;
    public static final int[] q;

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2;
        String str = Build.DEVICE;
        b = str;
        String str2 = Build.MANUFACTURER;
        c = str2;
        String str3 = Build.MODEL;
        d = str3;
        e = str + ", " + str3 + ", " + str2 + ", " + i2;
        f = new byte[0];
        g = new long[0];
        h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        j = Pattern.compile("%([A-Fa-f0-9]{2})");
        k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, HttpStatus.SC_SWITCHING_PROTOCOLS, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, HttpStatus.SC_ACCEPTED, HttpStatus.SC_RESET_CONTENT, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, HttpStatus.SC_CREATED, HttpStatus.SC_PARTIAL_CONTENT, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, HttpStatus.SC_PROCESSING, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, HttpStatus.SC_MULTI_STATUS, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long A(float f2, long j2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * f2);
    }

    public static long B(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime();
    }

    public static int C(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int D(int i2, int i3) {
        if (i2 != 2) {
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i3 * 3;
            }
            return i3 * 4;
        }
        return i3 * 2;
    }

    public static long E(float f2, long j2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / f2);
    }

    public static String[] F() {
        String[] strArrSplit;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i2 = a;
        if (i2 >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i2 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            strArrSplit[i3] = T(strArrSplit[i3]);
        }
        return strArrSplit;
    }

    public static String G(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            z04.v("Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String H(int i2) {
        switch (i2) {
            case ContentLengthStrategy.CHUNKED /* -2 */:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
            case 2:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i2 >= 10000 ? wg0.g(i2, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean I(defpackage.q3b r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.getPlaybackState()
            r2 = 1
            if (r1 != r2) goto L17
            r3 = 2
            boolean r3 = r4.t1(r3)
            if (r3 == 0) goto L17
            r4.prepare()
        L15:
            r0 = r2
            goto L24
        L17:
            r3 = 4
            if (r1 != r3) goto L24
            boolean r1 = r4.t1(r3)
            if (r1 == 0) goto L24
            r4.E()
            goto L15
        L24:
            boolean r1 = r4.t1(r2)
            if (r1 == 0) goto L2e
            r4.play()
            goto L2f
        L2e:
            r2 = r0
        L2f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaf.I(q3b):boolean");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static int J(Uri uri, String str) {
        int i2;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme != null && lz7.j("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                String strT = lz7.T(lastPathSegment.substring(iLastIndexOf + 1));
                strT.getClass();
                switch (strT.hashCode()) {
                    case 104579:
                        if (strT.equals("ism")) {
                            break;
                        }
                        break;
                    case 108321:
                        if (strT.equals("mpd")) {
                            break;
                        }
                        break;
                    case 3242057:
                        if (strT.equals("isml")) {
                            break;
                        }
                        break;
                    case 3299913:
                        if (strT.equals("m3u8")) {
                            break;
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
                    */
                /*
                    Method dump skipped, instructions count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.oaf.J(android.net.Uri, java.lang.String):int");
            }

            public static boolean K(String str) {
                int i2;
                str.getClass();
                i2 = a;
                switch (str) {
                    case "image/avif":
                        return i2 >= 34;
                    case "image/heic":
                    case "image/heif":
                        return i2 >= 26;
                    case "image/jpeg":
                    case "image/webp":
                    case "image/bmp":
                    case "image/png":
                        return true;
                    default:
                        return false;
                }
            }

            public static boolean L(int i2) {
                return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
            }

            public static boolean M(Context context) {
                int i2 = a;
                if (i2 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
                    if (i2 == 30) {
                        String str = d;
                        if (lz7.j(str, "moto g(20)") || lz7.j(str, "rmx3231")) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static boolean N(int i2) {
                return i2 == 10 || i2 == 13;
            }

            public static boolean O() {
                String strT = lz7.T(b);
                return strT.contains("emulator") || strT.contains("emu64a") || strT.contains("emu64x") || strT.contains("generic");
            }

            public static boolean P(Context context) {
                UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
            }

            public static String Q(Context context, String str) throws IOException {
                InputStream inputStreamOpen = null;
                try {
                    inputStreamOpen = context.getAssets().open(str);
                    return q(zv0.b(inputStreamOpen));
                } finally {
                    h(inputStreamOpen);
                }
            }

            public static void R(List list, int i2, int i3, int i4) {
                ArrayDeque arrayDeque = new ArrayDeque();
                for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
                    arrayDeque.addFirst(list.remove(i2 + i5));
                }
                list.addAll(Math.min(i4, list.size()), arrayDeque);
            }

            public static long S(long j2) {
                return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
            }

            public static String T(String str) {
                if (str == null) {
                    return null;
                }
                String strReplace = str.replace('_', '-');
                if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                    str = strReplace;
                }
                String strT = lz7.T(str);
                int i2 = 0;
                String str2 = strT.split("-", 2)[0];
                if (l == null) {
                    String[] iSOLanguages = Locale.getISOLanguages();
                    int length = iSOLanguages.length;
                    String[] strArr = m;
                    HashMap map = new HashMap(length + strArr.length);
                    for (String str3 : iSOLanguages) {
                        try {
                            String iSO3Language = new Locale(str3).getISO3Language();
                            if (!TextUtils.isEmpty(iSO3Language)) {
                                map.put(iSO3Language, str3);
                            }
                        } catch (MissingResourceException unused) {
                        }
                    }
                    for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                        map.put(strArr[i3], strArr[i3 + 1]);
                    }
                    l = map;
                }
                String str4 = (String) l.get(str2);
                if (str4 != null) {
                    StringBuilder sbL = au1.l(str4);
                    sbL.append(strT.substring(str2.length()));
                    strT = sbL.toString();
                    str2 = str4;
                }
                if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
                    return strT;
                }
                while (true) {
                    String[] strArr2 = n;
                    if (i2 >= strArr2.length) {
                        return strT;
                    }
                    if (strT.startsWith(strArr2[i2])) {
                        return strArr2[i2 + 1] + strT.substring(strArr2[i2].length());
                    }
                    i2 += 2;
                }
            }

            public static Object[] U(int i2, Object[] objArr) {
                fm9.f(i2 <= objArr.length);
                return Arrays.copyOf(objArr, i2);
            }

            public static long V(String str) throws ParserException {
                Matcher matcher = h.matcher(str);
                if (!matcher.matches()) {
                    throw ParserException.a(null, "Invalid date/time format: " + str);
                }
                int i2 = 0;
                if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                    i2 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                    if ("-".equals(matcher.group(11))) {
                        i2 *= -1;
                    }
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                gregorianCalendar.clear();
                gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                if (!TextUtils.isEmpty(matcher.group(8))) {
                    gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                }
                long timeInMillis = gregorianCalendar.getTimeInMillis();
                return i2 != 0 ? timeInMillis - (i2 * 60000) : timeInMillis;
            }

            public static void W(Handler handler, Runnable runnable) {
                if (handler.getLooper().getThread().isAlive()) {
                    if (handler.getLooper() == Looper.myLooper()) {
                        runnable.run();
                    } else {
                        handler.post(runnable);
                    }
                }
            }

            public static void X(List list, int i2, int i3) {
                if (i2 < 0 || i3 > list.size() || i2 > i3) {
                    throw new IllegalArgumentException();
                }
                if (i2 != i3) {
                    list.subList(i2, i3).clear();
                }
            }

            public static long Y(int i2, long j2) {
                return a0(j2, 1000000L, i2, RoundingMode.FLOOR);
            }

            public static void Z(long[] jArr, long j2) {
                RoundingMode roundingMode = RoundingMode.FLOOR;
                int i2 = 0;
                if (j2 >= 1000000 && j2 % 1000000 == 0) {
                    long jM = m6d.m(j2, 1000000L, RoundingMode.UNNECESSARY);
                    while (i2 < jArr.length) {
                        jArr[i2] = m6d.m(jArr[i2], jM, roundingMode);
                        i2++;
                    }
                    return;
                }
                if (j2 < 1000000 && 1000000 % j2 == 0) {
                    long jM2 = m6d.m(1000000L, j2, RoundingMode.UNNECESSARY);
                    while (i2 < jArr.length) {
                        jArr[i2] = m6d.L(jArr[i2], jM2);
                        i2++;
                    }
                    return;
                }
                for (int i3 = 0; i3 < jArr.length; i3++) {
                    long j3 = jArr[i3];
                    if (j3 != 0) {
                        if (j2 >= j3 && j2 % j3 == 0) {
                            jArr[i3] = m6d.m(1000000L, m6d.m(j2, j3, RoundingMode.UNNECESSARY), roundingMode);
                        } else if (j2 >= j3 || j3 % j2 != 0) {
                            jArr[i3] = b0(j3, 1000000L, j2, roundingMode);
                        } else {
                            jArr[i3] = m6d.L(1000000L, m6d.m(j3, j2, RoundingMode.UNNECESSARY));
                        }
                    }
                }
            }

            public static boolean a(Object obj, Object obj2) {
                return obj == null ? obj2 == null : obj.equals(obj2);
            }

            public static long a0(long j2, long j3, long j4, RoundingMode roundingMode) {
                if (j2 == 0 || j3 == 0) {
                    return 0L;
                }
                return (j4 < j3 || j4 % j3 != 0) ? (j4 >= j3 || j3 % j4 != 0) ? (j4 < j2 || j4 % j2 != 0) ? (j4 >= j2 || j2 % j4 != 0) ? b0(j2, j3, j4, roundingMode) : m6d.L(j3, m6d.m(j2, j4, RoundingMode.UNNECESSARY)) : m6d.m(j3, m6d.m(j4, j2, RoundingMode.UNNECESSARY), roundingMode) : m6d.L(j2, m6d.m(j3, j4, RoundingMode.UNNECESSARY)) : m6d.m(j2, m6d.m(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
            }

            public static int b(long[] jArr, long j2, boolean z) {
                int i2;
                int iBinarySearch = Arrays.binarySearch(jArr, j2);
                if (iBinarySearch < 0) {
                    return ~iBinarySearch;
                }
                while (true) {
                    i2 = iBinarySearch + 1;
                    if (i2 >= jArr.length || jArr[i2] != j2) {
                        break;
                    }
                    iBinarySearch = i2;
                }
                return z ? iBinarySearch : i2;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x00ff  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static long b0(long r9, long r11, long r13, java.math.RoundingMode r15) {
                /*
                    Method dump skipped, instructions count: 320
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.oaf.b0(long, long, long, java.math.RoundingMode):long");
            }

            public static int c(nv7 nv7Var, long j2) {
                int i2 = nv7Var.b - 1;
                int i3 = 0;
                while (i3 <= i2) {
                    int i4 = (i3 + i2) >>> 1;
                    if (nv7Var.b(i4) < j2) {
                        i3 = i4 + 1;
                    } else {
                        i2 = i4 - 1;
                    }
                }
                int i5 = i2 + 1;
                if (i5 < nv7Var.b && nv7Var.b(i5) == j2) {
                    return i5;
                }
                if (i2 == -1) {
                    return 0;
                }
                return i2;
            }

            public static boolean c0(q3b q3bVar, boolean z) {
                if (q3bVar == null || !q3bVar.u() || q3bVar.getPlaybackState() == 1 || q3bVar.getPlaybackState() == 4) {
                    return true;
                }
                return z && q3bVar.v0() != 0;
            }

            public static int d(Long l2, List list, boolean z) {
                int i2;
                int iBinarySearch = Collections.binarySearch(list, l2);
                if (iBinarySearch < 0) {
                    i2 = -(iBinarySearch + 2);
                } else {
                    while (true) {
                        int i3 = iBinarySearch - 1;
                        if (i3 < 0 || ((Comparable) list.get(i3)).compareTo(l2) != 0) {
                            break;
                        }
                        iBinarySearch = i3;
                    }
                    i2 = iBinarySearch;
                }
                return z ? Math.max(0, i2) : i2;
            }

            public static String[] d0(String str) {
                return str.split("/", -1);
            }

            public static int e(int[] iArr, int i2, boolean z, boolean z2) {
                int i3;
                int i4;
                int iBinarySearch = Arrays.binarySearch(iArr, i2);
                if (iBinarySearch < 0) {
                    i4 = -(iBinarySearch + 2);
                } else {
                    while (true) {
                        i3 = iBinarySearch - 1;
                        if (i3 < 0 || iArr[i3] != i2) {
                            break;
                        }
                        iBinarySearch = i3;
                    }
                    i4 = z ? iBinarySearch : i3;
                }
                return z2 ? Math.max(0, i4) : i4;
            }

            public static String[] e0(String str) {
                return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
            }

            public static int f(long[] jArr, long j2, boolean z) {
                int i2;
                int iBinarySearch = Arrays.binarySearch(jArr, j2);
                if (iBinarySearch < 0) {
                    i2 = -(iBinarySearch + 2);
                } else {
                    while (true) {
                        int i3 = iBinarySearch - 1;
                        if (i3 < 0 || jArr[i3] != j2) {
                            break;
                        }
                        iBinarySearch = i3;
                    }
                    i2 = iBinarySearch;
                }
                return z ? Math.max(0, i2) : i2;
            }

            public static boolean f0(SQLiteDatabase sQLiteDatabase, String str) {
                return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
            }

            public static int g(int i2, int i3) {
                return ((i2 + i3) - 1) / i3;
            }

            public static ccd g0(bm7 bm7Var, vu vuVar) {
                ccd ccdVar = new ccd();
                fre freVar = new fre(ccdVar, 3, bm7Var);
                nk4 nk4Var = nk4.a;
                ccdVar.d(freVar, nk4Var);
                bm7Var.d(new ewc(bm7Var, ccdVar, vuVar, 10), nk4Var);
                return ccdVar;
            }

            public static void h(Closeable closeable) throws IOException {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                    }
                }
            }

            public static long h0(long j2) {
                return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
            }

            public static float i(float f2, float f3, float f4) {
                return Math.max(f3, Math.min(f2, f4));
            }

            public static int j(int i2, int i3, int i4) {
                return Math.max(i3, Math.min(i2, i4));
            }

            public static long k(long j2, long j3, long j4) {
                return Math.max(j3, Math.min(j2, j4));
            }

            public static boolean l(SparseArray sparseArray, int i2) {
                return sparseArray.indexOfKey(i2) >= 0;
            }

            public static boolean m(Object[] objArr, Object obj) {
                for (Object obj2 : objArr) {
                    if (a(obj2, obj)) {
                        return true;
                    }
                }
                return false;
            }

            public static int n(int i2, int i3, int i4, byte[] bArr) {
                while (i2 < i3) {
                    i4 = o[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
                    i2++;
                }
                return i4;
            }

            public static Handler o(Handler.Callback callback) {
                Looper looperMyLooper = Looper.myLooper();
                fm9.l(looperMyLooper);
                return new Handler(looperMyLooper, callback);
            }

            public static Handler p(hl4 hl4Var) {
                return new Handler(w(), hl4Var);
            }

            public static String q(byte[] bArr) {
                return new String(bArr, b52.c);
            }

            public static int r(int i2) {
                if (i2 == 20) {
                    return 30;
                }
                if (i2 == 22) {
                    return 31;
                }
                if (i2 == 30) {
                    return 34;
                }
                switch (i2) {
                    case 2:
                    case 3:
                        return 3;
                    case 4:
                    case 5:
                    case 6:
                        return 21;
                    case 7:
                    case 8:
                        return 23;
                    case 9:
                    case 10:
                    case 11:
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return 28;
                    default:
                        switch (i2) {
                            case Protos.Attaches.Attach.LOCATION /* 14 */:
                                return 25;
                            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            case 16:
                            case LangUtils.HASH_SEED /* 17 */:
                            case 18:
                                return 28;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
            }

            public static AudioFormat s(int i2, int i3, int i4) {
                return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static int t(int r2) {
                /*
                    r0 = 6396(0x18fc, float:8.963E-42)
                    switch(r2) {
                        case 1: goto L28;
                        case 2: goto L25;
                        case 3: goto L22;
                        case 4: goto L1f;
                        case 5: goto L1c;
                        case 6: goto L19;
                        case 7: goto L16;
                        case 8: goto L15;
                        case 9: goto L5;
                        case 10: goto Lb;
                        case 11: goto L5;
                        case 12: goto L7;
                        default: goto L5;
                    }
                L5:
                    r2 = 0
                    return r2
                L7:
                    r2 = 743676(0xb58fc, float:1.042112E-39)
                    return r2
                Lb:
                    int r2 = defpackage.oaf.a
                    r1 = 32
                    if (r2 < r1) goto L15
                    r2 = 737532(0xb40fc, float:1.033502E-39)
                    return r2
                L15:
                    return r0
                L16:
                    r2 = 1276(0x4fc, float:1.788E-42)
                    return r2
                L19:
                    r2 = 252(0xfc, float:3.53E-43)
                    return r2
                L1c:
                    r2 = 220(0xdc, float:3.08E-43)
                    return r2
                L1f:
                    r2 = 204(0xcc, float:2.86E-43)
                    return r2
                L22:
                    r2 = 28
                    return r2
                L25:
                    r2 = 12
                    return r2
                L28:
                    r2 = 4
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.oaf.t(int):int");
            }

            public static int u(int i2, String str) {
                int i3 = 0;
                for (String str2 : e0(str)) {
                    if (i2 == ia9.g(ia9.c(str2))) {
                        i3++;
                    }
                }
                return i3;
            }

            public static String v(int i2, String str) {
                String[] strArrE0 = e0(str);
                if (strArrE0.length == 0) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                for (String str2 : strArrE0) {
                    if (i2 == ia9.g(ia9.c(str2))) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(str2);
                    }
                }
                if (sb.length() > 0) {
                    return sb.toString();
                }
                return null;
            }

            public static Looper w() {
                Looper looperMyLooper = Looper.myLooper();
                return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
            }

            public static int x(int i2) {
                if (i2 == 2 || i2 == 4) {
                    return 6005;
                }
                if (i2 == 10) {
                    return 6004;
                }
                if (i2 == 7) {
                    return 6005;
                }
                if (i2 == 8) {
                    return 6003;
                }
                switch (i2) {
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return 6003;
                    case 16:
                    case 18:
                        return 6005;
                    case LangUtils.HASH_SEED /* 17 */:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        return 6004;
                    default:
                        switch (i2) {
                            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                                return 6002;
                            default:
                                return 6006;
                        }
                }
            }

            public static int y(String str) throws NumberFormatException {
                String[] strArrSplit;
                int length;
                if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                    return 0;
                }
                String str2 = strArrSplit[length - 1];
                boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
                try {
                    str2.getClass();
                    int i2 = Integer.parseInt(str2);
                    return z ? -i2 : i2;
                } catch (NumberFormatException unused) {
                    return 0;
                }
            }

            public static String z(int i2) {
                if (i2 == 0) {
                    return "NO";
                }
                if (i2 == 1) {
                    return "NO_UNSUPPORTED_TYPE";
                }
                if (i2 == 2) {
                    return "NO_UNSUPPORTED_DRM";
                }
                if (i2 == 3) {
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                if (i2 == 4) {
                    return "YES";
                }
                throw new IllegalStateException();
            }
        }
