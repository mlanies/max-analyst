package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class c65 {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public static final byte[] I;
    public static final byte[] J;
    public static final byte[] K;
    public static final byte[] L;
    public static final byte[] M;
    public static final byte[] N;
    public static final byte[] O;
    public static final String[] P;
    public static final int[] Q;
    public static final byte[] R;
    public static final z55 S;
    public static final z55[][] T;
    public static final z55[] U;
    public static final HashMap[] V;
    public static final HashMap[] W;
    public static final HashSet X;
    public static final HashMap Y;
    public static final Charset Z;
    public static final byte[] a0;
    public static final byte[] b0;
    public static final Pattern c0;
    public static final Pattern d0;
    public static final Pattern e0;
    public static final boolean t = Log.isLoggable("ExifInterface", 3);
    public static final int[] u;
    public static final int[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public byte[] m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        u = new int[]{8, 8, 8};
        v = new int[]{8};
        w = new byte[]{-1, -40, -1};
        x = new byte[]{102, 116, 121, 112};
        y = new byte[]{109, 105, 102, 49};
        z = new byte[]{104, 101, 105, 99};
        A = new byte[]{79, 76, 89, 77, 80, 0};
        B = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        C = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        D = new byte[]{101, 88, 73, 102};
        E = new byte[]{73, 72, 68, 82};
        F = new byte[]{73, 69, 78, 68};
        G = new byte[]{82, 73, 70, 70};
        H = new byte[]{87, 69, 66, 80};
        I = new byte[]{69, 88, 73, 70};
        J = new byte[]{-99, 1, 42};
        K = "VP8X".getBytes(Charset.defaultCharset());
        L = "VP8L".getBytes(Charset.defaultCharset());
        M = "VP8 ".getBytes(Charset.defaultCharset());
        N = "ANIM".getBytes(Charset.defaultCharset());
        O = "ANMF".getBytes(Charset.defaultCharset());
        P = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        Q = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        R = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        z55[] z55VarArr = {new z55("NewSubfileType", 254, 4), new z55("SubfileType", 255, 4), new z55(256, "ImageWidth", 3, 4), new z55(257, "ImageLength", 3, 4), new z55("BitsPerSample", 258, 3), new z55("Compression", 259, 3), new z55("PhotometricInterpretation", 262, 3), new z55("ImageDescription", 270, 2), new z55("Make", 271, 2), new z55("Model", 272, 2), new z55(273, "StripOffsets", 3, 4), new z55("Orientation", 274, 3), new z55("SamplesPerPixel", 277, 3), new z55(278, "RowsPerStrip", 3, 4), new z55(279, "StripByteCounts", 3, 4), new z55("XResolution", 282, 5), new z55("YResolution", 283, 5), new z55("PlanarConfiguration", 284, 3), new z55("ResolutionUnit", 296, 3), new z55("TransferFunction", HttpStatus.SC_MOVED_PERMANENTLY, 3), new z55("Software", HttpStatus.SC_USE_PROXY, 2), new z55("DateTime", 306, 2), new z55("Artist", 315, 2), new z55("WhitePoint", 318, 5), new z55("PrimaryChromaticities", 319, 5), new z55("SubIFDPointer", 330, 4), new z55("JPEGInterchangeFormat", 513, 4), new z55("JPEGInterchangeFormatLength", 514, 4), new z55("YCbCrCoefficients", 529, 5), new z55("YCbCrSubSampling", 530, 3), new z55("YCbCrPositioning", 531, 3), new z55("ReferenceBlackWhite", 532, 5), new z55("Copyright", 33432, 2), new z55("ExifIFDPointer", 34665, 4), new z55("GPSInfoIFDPointer", 34853, 4), new z55("SensorTopBorder", 4, 4), new z55("SensorLeftBorder", 5, 4), new z55("SensorBottomBorder", 6, 4), new z55("SensorRightBorder", 7, 4), new z55("ISO", 23, 3), new z55("JpgFromRaw", 46, 7), new z55("Xmp", 700, 1)};
        z55[] z55VarArr2 = {new z55("ExposureTime", 33434, 5), new z55("FNumber", 33437, 5), new z55("ExposureProgram", 34850, 3), new z55("SpectralSensitivity", 34852, 2), new z55("PhotographicSensitivity", 34855, 3), new z55("OECF", 34856, 7), new z55("SensitivityType", 34864, 3), new z55("StandardOutputSensitivity", 34865, 4), new z55("RecommendedExposureIndex", 34866, 4), new z55("ISOSpeed", 34867, 4), new z55("ISOSpeedLatitudeyyy", 34868, 4), new z55("ISOSpeedLatitudezzz", 34869, 4), new z55("ExifVersion", 36864, 2), new z55("DateTimeOriginal", 36867, 2), new z55("DateTimeDigitized", 36868, 2), new z55("OffsetTime", 36880, 2), new z55("OffsetTimeOriginal", 36881, 2), new z55("OffsetTimeDigitized", 36882, 2), new z55("ComponentsConfiguration", 37121, 7), new z55("CompressedBitsPerPixel", 37122, 5), new z55("ShutterSpeedValue", 37377, 10), new z55("ApertureValue", 37378, 5), new z55("BrightnessValue", 37379, 10), new z55("ExposureBiasValue", 37380, 10), new z55("MaxApertureValue", 37381, 5), new z55("SubjectDistance", 37382, 5), new z55("MeteringMode", 37383, 3), new z55("LightSource", 37384, 3), new z55("Flash", 37385, 3), new z55("FocalLength", 37386, 5), new z55("SubjectArea", 37396, 3), new z55("MakerNote", 37500, 7), new z55("UserComment", 37510, 7), new z55("SubSecTime", 37520, 2), new z55("SubSecTimeOriginal", 37521, 2), new z55("SubSecTimeDigitized", 37522, 2), new z55("FlashpixVersion", 40960, 7), new z55("ColorSpace", 40961, 3), new z55(40962, "PixelXDimension", 3, 4), new z55(40963, "PixelYDimension", 3, 4), new z55("RelatedSoundFile", 40964, 2), new z55("InteroperabilityIFDPointer", 40965, 4), new z55("FlashEnergy", 41483, 5), new z55("SpatialFrequencyResponse", 41484, 7), new z55("FocalPlaneXResolution", 41486, 5), new z55("FocalPlaneYResolution", 41487, 5), new z55("FocalPlaneResolutionUnit", 41488, 3), new z55("SubjectLocation", 41492, 3), new z55("ExposureIndex", 41493, 5), new z55("SensingMethod", 41495, 3), new z55("FileSource", 41728, 7), new z55("SceneType", 41729, 7), new z55("CFAPattern", 41730, 7), new z55("CustomRendered", 41985, 3), new z55("ExposureMode", 41986, 3), new z55("WhiteBalance", 41987, 3), new z55("DigitalZoomRatio", 41988, 5), new z55("FocalLengthIn35mmFilm", 41989, 3), new z55("SceneCaptureType", 41990, 3), new z55("GainControl", 41991, 3), new z55("Contrast", 41992, 3), new z55("Saturation", 41993, 3), new z55("Sharpness", 41994, 3), new z55("DeviceSettingDescription", 41995, 7), new z55("SubjectDistanceRange", 41996, 3), new z55("ImageUniqueID", 42016, 2), new z55("CameraOwnerName", 42032, 2), new z55("BodySerialNumber", 42033, 2), new z55("LensSpecification", 42034, 5), new z55("LensMake", 42035, 2), new z55("LensModel", 42036, 2), new z55("Gamma", 42240, 5), new z55("DNGVersion", 50706, 1), new z55(50720, "DefaultCropSize", 3, 4)};
        z55[] z55VarArr3 = {new z55("GPSVersionID", 0, 1), new z55("GPSLatitudeRef", 1, 2), new z55(2, "GPSLatitude", 5, 10), new z55("GPSLongitudeRef", 3, 2), new z55(4, "GPSLongitude", 5, 10), new z55("GPSAltitudeRef", 5, 1), new z55("GPSAltitude", 6, 5), new z55("GPSTimeStamp", 7, 5), new z55("GPSSatellites", 8, 2), new z55("GPSStatus", 9, 2), new z55("GPSMeasureMode", 10, 2), new z55("GPSDOP", 11, 5), new z55("GPSSpeedRef", 12, 2), new z55("GPSSpeed", 13, 5), new z55("GPSTrackRef", 14, 2), new z55("GPSTrack", 15, 5), new z55("GPSImgDirectionRef", 16, 2), new z55("GPSImgDirection", 17, 5), new z55("GPSMapDatum", 18, 2), new z55("GPSDestLatitudeRef", 19, 2), new z55("GPSDestLatitude", 20, 5), new z55("GPSDestLongitudeRef", 21, 2), new z55("GPSDestLongitude", 22, 5), new z55("GPSDestBearingRef", 23, 2), new z55("GPSDestBearing", 24, 5), new z55("GPSDestDistanceRef", 25, 2), new z55("GPSDestDistance", 26, 5), new z55("GPSProcessingMethod", 27, 7), new z55("GPSAreaInformation", 28, 7), new z55("GPSDateStamp", 29, 2), new z55("GPSDifferential", 30, 3), new z55("GPSHPositioningError", 31, 5)};
        z55[] z55VarArr4 = {new z55("InteroperabilityIndex", 1, 2)};
        z55[] z55VarArr5 = {new z55("NewSubfileType", 254, 4), new z55("SubfileType", 255, 4), new z55(256, "ThumbnailImageWidth", 3, 4), new z55(257, "ThumbnailImageLength", 3, 4), new z55("BitsPerSample", 258, 3), new z55("Compression", 259, 3), new z55("PhotometricInterpretation", 262, 3), new z55("ImageDescription", 270, 2), new z55("Make", 271, 2), new z55("Model", 272, 2), new z55(273, "StripOffsets", 3, 4), new z55("ThumbnailOrientation", 274, 3), new z55("SamplesPerPixel", 277, 3), new z55(278, "RowsPerStrip", 3, 4), new z55(279, "StripByteCounts", 3, 4), new z55("XResolution", 282, 5), new z55("YResolution", 283, 5), new z55("PlanarConfiguration", 284, 3), new z55("ResolutionUnit", 296, 3), new z55("TransferFunction", HttpStatus.SC_MOVED_PERMANENTLY, 3), new z55("Software", HttpStatus.SC_USE_PROXY, 2), new z55("DateTime", 306, 2), new z55("Artist", 315, 2), new z55("WhitePoint", 318, 5), new z55("PrimaryChromaticities", 319, 5), new z55("SubIFDPointer", 330, 4), new z55("JPEGInterchangeFormat", 513, 4), new z55("JPEGInterchangeFormatLength", 514, 4), new z55("YCbCrCoefficients", 529, 5), new z55("YCbCrSubSampling", 530, 3), new z55("YCbCrPositioning", 531, 3), new z55("ReferenceBlackWhite", 532, 5), new z55("Copyright", 33432, 2), new z55("ExifIFDPointer", 34665, 4), new z55("GPSInfoIFDPointer", 34853, 4), new z55("DNGVersion", 50706, 1), new z55(50720, "DefaultCropSize", 3, 4)};
        S = new z55("StripOffsets", 273, 3);
        T = new z55[][]{z55VarArr, z55VarArr2, z55VarArr3, z55VarArr4, z55VarArr5, z55VarArr, new z55[]{new z55("ThumbnailImage", 256, 7), new z55("CameraSettingsIFDPointer", 8224, 4), new z55("ImageProcessingIFDPointer", 8256, 4)}, new z55[]{new z55("PreviewImageStart", 257, 4), new z55("PreviewImageLength", 258, 4)}, new z55[]{new z55("AspectFrame", 4371, 3)}, new z55[]{new z55("ColorSpace", 55, 3)}};
        U = new z55[]{new z55("SubIFDPointer", 330, 4), new z55("ExifIFDPointer", 34665, 4), new z55("GPSInfoIFDPointer", 34853, 4), new z55("InteroperabilityIFDPointer", 40965, 4), new z55("CameraSettingsIFDPointer", 8224, 1), new z55("ImageProcessingIFDPointer", 8256, 1)};
        V = new HashMap[10];
        W = new HashMap[10];
        X = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        Y = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        Z = charsetForName;
        a0 = "Exif\u0000\u0000".getBytes(charsetForName);
        b0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            z55[][] z55VarArr6 = T;
            if (i >= z55VarArr6.length) {
                HashMap map = Y;
                z55[] z55VarArr7 = U;
                map.put(Integer.valueOf(z55VarArr7[0].a), 5);
                map.put(Integer.valueOf(z55VarArr7[1].a), 1);
                map.put(Integer.valueOf(z55VarArr7[2].a), 2);
                map.put(Integer.valueOf(z55VarArr7[3].a), 3);
                map.put(Integer.valueOf(z55VarArr7[4].a), 7);
                map.put(Integer.valueOf(z55VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                c0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                d0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                e0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            V[i] = new HashMap();
            W[i] = new HashMap();
            for (z55 z55Var : z55VarArr6[i]) {
                V[i].put(Integer.valueOf(z55Var.a), z55Var);
                W[i].put(z55Var.b, z55Var);
            }
            i++;
        }
    }

    public c65(String str) throws Throwable {
        FileInputStream fileInputStream;
        boolean z2;
        z55[][] z55VarArr = T;
        this.e = new HashMap[z55VarArr.length];
        this.f = new HashSet(z55VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.c = null;
        this.a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                d65.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z2 = true;
            } catch (Exception unused) {
                z2 = false;
            }
            if (z2) {
                this.b = fileInputStream.getFD();
            } else {
                this.b = null;
            }
            t(fileInputStream);
            br7.i(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            br7.i(fileInputStream2);
            throw th;
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d3 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d2 / 60.0d) + d;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(x55 x55Var, uv0 uv0Var, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (x55Var.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = Z;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            int i = x55Var.readInt();
            uv0Var.write(bArr3);
            uv0Var.d(i);
            if (i % 2 == 1) {
                i++;
            }
            br7.l(x55Var, uv0Var, i);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static Pair q(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairQ = q(strArrSplit[0]);
            if (((Integer) pairQ.first).intValue() == 2) {
                return pairQ;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairQ2 = q(strArrSplit[i]);
                int iIntValue = (((Integer) pairQ2.first).equals(pairQ.first) || ((Integer) pairQ2.second).equals(pairQ.first)) ? ((Integer) pairQ.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairQ.second).intValue() == -1 || !(((Integer) pairQ2.first).equals(pairQ.second) || ((Integer) pairQ2.second).equals(pairQ.second))) ? -1 : ((Integer) pairQ.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairQ = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairQ = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairQ;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    return (j < 0 || j > 65535) ? j < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static ByteOrder w(x55 x55Var) throws IOException {
        short s = x55Var.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    public final void A(int i, String str, String str2) {
        HashMap[] mapArr = this.e;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fa A[Catch: all -> 0x010a, Exception -> 0x010d, TryCatch #19 {Exception -> 0x010d, all -> 0x010a, blocks: (B:80:0x00f6, B:82:0x00fa, B:89:0x0118, B:88:0x0110), top: B:128:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110 A[Catch: all -> 0x010a, Exception -> 0x010d, TryCatch #19 {Exception -> 0x010d, all -> 0x010a, blocks: (B:80:0x00f6, B:82:0x00fa, B:89:0x0118, B:88:0x0110), top: B:128:0x00f6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.B():void");
    }

    public final void C(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        x55 x55Var = new x55(bufferedInputStream);
        uv0 uv0Var = new uv0(bufferedOutputStream, ByteOrder.BIG_ENDIAN, 1);
        if (x55Var.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        uv0Var.a(-1);
        if (x55Var.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        uv0Var.a(-40);
        String strD = d("Xmp");
        HashMap[] mapArr = this.e;
        y55 y55Var = (strD == null || !this.s) ? null : (y55) mapArr[0].remove("Xmp");
        uv0Var.a(-1);
        uv0Var.a(-31);
        K(uv0Var);
        if (y55Var != null) {
            mapArr[0].put("Xmp", y55Var);
        }
        byte[] bArr = new byte[4096];
        while (x55Var.readByte() == -1) {
            byte b = x55Var.readByte();
            if (b == -39 || b == -38) {
                uv0Var.a(-1);
                uv0Var.a(b);
                br7.m(x55Var, uv0Var);
                return;
            }
            if (b != -31) {
                uv0Var.a(-1);
                uv0Var.a(b);
                int unsignedShort = x55Var.readUnsignedShort();
                uv0Var.g((short) unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int i2 = x55Var.read(bArr, 0, Math.min(i, 4096));
                    if (i2 >= 0) {
                        uv0Var.write(bArr, 0, i2);
                        i -= i2;
                    }
                }
            } else {
                int unsignedShort2 = x55Var.readUnsignedShort();
                int i3 = unsignedShort2 - 2;
                if (i3 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i3 >= 6) {
                    if (x55Var.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, a0)) {
                        x55Var.a(unsignedShort2 - 8);
                    }
                }
                uv0Var.a(-1);
                uv0Var.a(b);
                uv0Var.g((short) unsignedShort2);
                if (i3 >= 6) {
                    i3 = unsignedShort2 - 8;
                    uv0Var.write(bArr2);
                }
                while (i3 > 0) {
                    int i4 = x55Var.read(bArr, 0, Math.min(i3, 4096));
                    if (i4 >= 0) {
                        uv0Var.write(bArr, 0, i4);
                        i3 -= i4;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        x55 x55Var = new x55(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        uv0 uv0Var = new uv0(bufferedOutputStream, byteOrder, 1);
        br7.l(x55Var, uv0Var, C.length);
        if (this.o == 0) {
            int i = x55Var.readInt();
            uv0Var.d(i);
            br7.l(x55Var, uv0Var, i + 8);
        } else {
            br7.l(x55Var, uv0Var, (r2 - r7.length) - 8);
            x55Var.a(x55Var.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                uv0 uv0Var2 = new uv0(byteArrayOutputStream2, byteOrder, 1);
                K(uv0Var2);
                byte[] byteArray = ((ByteArrayOutputStream) uv0Var2.b).toByteArray();
                uv0Var.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                uv0Var.d((int) crc32.getValue());
                br7.i(byteArrayOutputStream2);
                br7.m(x55Var, uv0Var);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                br7.i(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        uv0 uv0Var;
        int i;
        int i2;
        boolean z2;
        int i3;
        byte[] bArr;
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        x55 x55Var = new x55(bufferedInputStream, byteOrder);
        uv0 uv0Var2 = new uv0(bufferedOutputStream, byteOrder, 1);
        byte[] bArr2 = G;
        br7.l(x55Var, uv0Var2, bArr2.length);
        byte[] bArr3 = H;
        x55Var.a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            uv0 uv0Var3 = new uv0(byteArrayOutputStream, byteOrder, 1);
            int i4 = this.o;
            if (i4 != 0) {
                br7.l(x55Var, uv0Var3, (i4 - ((bArr2.length + 4) + bArr3.length)) - 8);
                x55Var.a(4);
                int i5 = x55Var.readInt();
                if (i5 % 2 != 0) {
                    i5++;
                }
                x55Var.a(i5);
                K(uv0Var3);
            } else {
                byte[] bArr4 = new byte[4];
                if (x55Var.read(bArr4) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
                byte[] bArr5 = K;
                boolean zEquals = Arrays.equals(bArr4, bArr5);
                byte[] bArr6 = M;
                byte[] bArr7 = L;
                if (!zEquals) {
                    if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                        int i6 = x55Var.readInt();
                        int i7 = i6 % 2 == 1 ? i6 + 1 : i6;
                        byte[] bArr8 = new byte[3];
                        boolean zEquals2 = Arrays.equals(bArr4, bArr6);
                        byte[] bArr9 = J;
                        if (zEquals2) {
                            x55Var.read(bArr8);
                            byte[] bArr10 = new byte[3];
                            uv0Var = uv0Var2;
                            if (x55Var.read(bArr10) != 3 || !Arrays.equals(bArr9, bArr10)) {
                                throw new IOException("Encountered error while checking VP8 signature");
                            }
                            i = x55Var.readInt();
                            i2 = (i << 18) >> 18;
                            i7 -= 10;
                            i3 = (i << 2) >> 18;
                            z2 = false;
                        } else {
                            uv0Var = uv0Var2;
                            if (!Arrays.equals(bArr4, bArr7)) {
                                i = 0;
                                i2 = 0;
                                z2 = false;
                                i3 = 0;
                            } else {
                                if (x55Var.readByte() != 47) {
                                    throw new IOException("Encountered error while checking VP8L signature");
                                }
                                i = x55Var.readInt();
                                z2 = true;
                                i2 = (i & 16383) + 1;
                                i3 = ((i & 268419072) >>> 14) + 1;
                                if ((i & 268435456) == 0) {
                                    z2 = false;
                                }
                                i7 -= 5;
                            }
                        }
                        uv0Var3.write(bArr5);
                        uv0Var3.d(10);
                        byte[] bArr11 = new byte[10];
                        if (z2) {
                            bArr11[0] = (byte) (bArr11[0] | 16);
                        }
                        bArr11[0] = (byte) (bArr11[0] | 8);
                        int i8 = i2 - 1;
                        int i9 = i3 - 1;
                        bArr = bArr3;
                        bArr11[4] = (byte) i8;
                        bArr11[5] = (byte) (i8 >> 8);
                        bArr11[6] = (byte) (i8 >> 16);
                        bArr11[7] = (byte) i9;
                        bArr11[8] = (byte) (i9 >> 8);
                        bArr11[9] = (byte) (i9 >> 16);
                        uv0Var3.write(bArr11);
                        uv0Var3.write(bArr4);
                        uv0Var3.d(i6);
                        if (Arrays.equals(bArr4, bArr6)) {
                            uv0Var3.write(bArr8);
                            uv0Var3.write(bArr9);
                            uv0Var3.d(i);
                        } else if (Arrays.equals(bArr4, bArr7)) {
                            uv0Var3.write(47);
                            uv0Var3.d(i);
                        }
                        br7.l(x55Var, uv0Var3, i7);
                        K(uv0Var3);
                    }
                    br7.m(x55Var, uv0Var3);
                    byte[] bArr12 = bArr;
                    uv0 uv0Var4 = uv0Var;
                    uv0Var4.d(byteArrayOutputStream.size() + bArr12.length);
                    uv0Var4.write(bArr12);
                    byteArrayOutputStream.writeTo(uv0Var4);
                    br7.i(byteArrayOutputStream);
                }
                int i10 = x55Var.readInt();
                byte[] bArr13 = new byte[i10 % 2 == 1 ? i10 + 1 : i10];
                x55Var.read(bArr13);
                byte b = (byte) (bArr13[0] | 8);
                bArr13[0] = b;
                boolean z3 = ((b >> 1) & 1) == 1;
                uv0Var3.write(bArr5);
                uv0Var3.d(i10);
                uv0Var3.write(bArr13);
                if (z3) {
                    c(x55Var, uv0Var3, N, null);
                    while (true) {
                        byte[] bArr14 = new byte[4];
                        bufferedInputStream.read(bArr14);
                        if (!Arrays.equals(bArr14, O)) {
                            break;
                        }
                        int i11 = x55Var.readInt();
                        uv0Var3.write(bArr14);
                        uv0Var3.d(i11);
                        if (i11 % 2 == 1) {
                            i11++;
                        }
                        br7.l(x55Var, uv0Var3, i11);
                    }
                    K(uv0Var3);
                } else {
                    c(x55Var, uv0Var3, bArr6, bArr7);
                    K(uv0Var3);
                }
            }
            uv0Var = uv0Var2;
            bArr = bArr3;
            br7.m(x55Var, uv0Var3);
            byte[] bArr122 = bArr;
            uv0 uv0Var42 = uv0Var;
            uv0Var42.d(byteArrayOutputStream.size() + bArr122.length);
            uv0Var42.write(bArr122);
            byteArrayOutputStream.writeTo(uv0Var42);
            br7.i(byteArrayOutputStream);
        } catch (Exception e2) {
            e = e2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            br7.i(byteArrayOutputStream2);
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.F(java.lang.String, java.lang.String):void");
    }

    public final void G(x55 x55Var) throws IOException {
        y55 y55Var;
        HashMap map = this.e[4];
        y55 y55Var2 = (y55) map.get("Compression");
        if (y55Var2 == null) {
            this.n = 6;
            r(x55Var, map);
            return;
        }
        int iH = y55Var2.h(this.g);
        this.n = iH;
        if (iH != 1) {
            if (iH == 6) {
                r(x55Var, map);
                return;
            } else if (iH != 7) {
                return;
            }
        }
        y55 y55Var3 = (y55) map.get("BitsPerSample");
        if (y55Var3 != null) {
            int[] iArr = (int[]) y55Var3.j(this.g);
            int[] iArr2 = u;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.d != 3 || (y55Var = (y55) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iH2 = y55Var.h(this.g);
                if ((iH2 != 1 || !Arrays.equals(iArr, v)) && (iH2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            y55 y55Var4 = (y55) map.get("StripOffsets");
            y55 y55Var5 = (y55) map.get("StripByteCounts");
            if (y55Var4 == null || y55Var5 == null) {
                return;
            }
            long[] jArrK = br7.k(y55Var4.j(this.g));
            long[] jArrK2 = br7.k(y55Var5.j(this.g));
            if (jArrK == null || jArrK.length == 0 || jArrK2 == null || jArrK2.length == 0 || jArrK.length != jArrK2.length) {
                return;
            }
            long j = 0;
            for (long j2 : jArrK2) {
                j += j2;
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            this.j = true;
            this.i = true;
            this.h = true;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < jArrK.length; i4++) {
                int i5 = (int) jArrK[i4];
                int i6 = (int) jArrK2[i4];
                if (i4 < jArrK.length - 1 && i5 + i6 != jArrK[i4 + 1]) {
                    this.j = false;
                }
                int i7 = i5 - i2;
                if (i7 < 0) {
                    return;
                }
                long j3 = i7;
                if (x55Var.skip(j3) != j3) {
                    return;
                }
                int i8 = i2 + i7;
                byte[] bArr2 = new byte[i6];
                if (x55Var.read(bArr2) != i6) {
                    return;
                }
                i2 = i8 + i6;
                System.arraycopy(bArr2, 0, bArr, i3, i6);
                i3 += i6;
            }
            this.m = bArr;
            if (this.j) {
                this.k = (int) jArrK[0];
                this.l = i;
            }
        }
    }

    public final void H(int i, int i2) {
        HashMap[] mapArr = this.e;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        y55 y55Var = (y55) mapArr[i].get("ImageLength");
        y55 y55Var2 = (y55) mapArr[i].get("ImageWidth");
        y55 y55Var3 = (y55) mapArr[i2].get("ImageLength");
        y55 y55Var4 = (y55) mapArr[i2].get("ImageWidth");
        if (y55Var == null || y55Var2 == null || y55Var3 == null || y55Var4 == null) {
            return;
        }
        int iH = y55Var.h(this.g);
        int iH2 = y55Var2.h(this.g);
        int iH3 = y55Var3.h(this.g);
        int iH4 = y55Var4.h(this.g);
        if (iH >= iH3 || iH2 >= iH4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void I(b65 b65Var, int i) throws IOException {
        y55 y55VarE;
        y55 y55VarE2;
        HashMap[] mapArr = this.e;
        y55 y55Var = (y55) mapArr[i].get("DefaultCropSize");
        y55 y55Var2 = (y55) mapArr[i].get("SensorTopBorder");
        y55 y55Var3 = (y55) mapArr[i].get("SensorLeftBorder");
        y55 y55Var4 = (y55) mapArr[i].get("SensorBottomBorder");
        y55 y55Var5 = (y55) mapArr[i].get("SensorRightBorder");
        if (y55Var != null) {
            if (y55Var.a == 5) {
                a65[] a65VarArr = (a65[]) y55Var.j(this.g);
                if (a65VarArr == null || a65VarArr.length != 2) {
                    Arrays.toString(a65VarArr);
                    return;
                }
                y55VarE = y55.d(new a65[]{a65VarArr[0]}, this.g);
                y55VarE2 = y55.d(new a65[]{a65VarArr[1]}, this.g);
            } else {
                int[] iArr = (int[]) y55Var.j(this.g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    y55VarE = y55.e(iArr[0], this.g);
                    y55VarE2 = y55.e(iArr[1], this.g);
                }
            }
            mapArr[i].put("ImageWidth", y55VarE);
            mapArr[i].put("ImageLength", y55VarE2);
            return;
        }
        if (y55Var2 != null && y55Var3 != null && y55Var4 != null && y55Var5 != null) {
            int iH = y55Var2.h(this.g);
            int iH2 = y55Var4.h(this.g);
            int iH3 = y55Var5.h(this.g);
            int iH4 = y55Var3.h(this.g);
            if (iH2 <= iH || iH3 <= iH4) {
                return;
            }
            y55 y55VarE3 = y55.e(iH2 - iH, this.g);
            y55 y55VarE4 = y55.e(iH3 - iH4, this.g);
            mapArr[i].put("ImageLength", y55VarE3);
            mapArr[i].put("ImageWidth", y55VarE4);
            return;
        }
        y55 y55Var6 = (y55) mapArr[i].get("ImageLength");
        y55 y55Var7 = (y55) mapArr[i].get("ImageWidth");
        if (y55Var6 == null || y55Var7 == null) {
            y55 y55Var8 = (y55) mapArr[i].get("JPEGInterchangeFormat");
            y55 y55Var9 = (y55) mapArr[i].get("JPEGInterchangeFormatLength");
            if (y55Var8 == null || y55Var9 == null) {
                return;
            }
            int iH5 = y55Var8.h(this.g);
            int iH6 = y55Var8.h(this.g);
            b65Var.d(iH5);
            byte[] bArr = new byte[iH6];
            b65Var.read(bArr);
            h(new x55(bArr), iH5, i);
        }
    }

    public final void J() {
        H(0, 5);
        H(0, 4);
        H(5, 4);
        HashMap[] mapArr = this.e;
        y55 y55Var = (y55) mapArr[1].get("PixelXDimension");
        y55 y55Var2 = (y55) mapArr[1].get("PixelYDimension");
        if (y55Var != null && y55Var2 != null) {
            mapArr[0].put("ImageWidth", y55Var);
            mapArr[0].put("ImageLength", y55Var2);
        }
        if (mapArr[4].isEmpty() && s(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        s(mapArr[4]);
        A(0, "ThumbnailOrientation", "Orientation");
        A(0, "ThumbnailImageLength", "ImageLength");
        A(0, "ThumbnailImageWidth", "ImageWidth");
        A(5, "ThumbnailOrientation", "Orientation");
        A(5, "ThumbnailImageLength", "ImageLength");
        A(5, "ThumbnailImageWidth", "ImageWidth");
        A(4, "Orientation", "ThumbnailOrientation");
        A(4, "ImageLength", "ThumbnailImageLength");
        A(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void K(uv0 uv0Var) throws IOException {
        HashMap[] mapArr;
        int[] iArr;
        Object[] objArr;
        z55[][] z55VarArr = T;
        int[] iArr2 = new int[z55VarArr.length];
        int[] iArr3 = new int[z55VarArr.length];
        z55[] z55VarArr2 = U;
        for (z55 z55Var : z55VarArr2) {
            z(z55Var.b);
        }
        if (this.h) {
            if (this.i) {
                z("StripOffsets");
                z("StripByteCounts");
            } else {
                z("JPEGInterchangeFormat");
                z("JPEGInterchangeFormatLength");
            }
        }
        int i = 0;
        while (true) {
            int length = z55VarArr.length;
            mapArr = this.e;
            if (i >= length) {
                break;
            }
            Object[] array = mapArr[i].entrySet().toArray();
            int length2 = array.length;
            int i2 = 0;
            while (i2 < length2) {
                Map.Entry entry = (Map.Entry) array[i2];
                if (entry.getValue() == null) {
                    objArr = array;
                    mapArr[i].remove(entry.getKey());
                } else {
                    objArr = array;
                }
                i2++;
                array = objArr;
            }
            i++;
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(z55VarArr2[1].b, y55.b(0L, this.g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(z55VarArr2[2].b, y55.b(0L, this.g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(z55VarArr2[3].b, y55.b(0L, this.g));
        }
        if (this.h) {
            if (this.i) {
                mapArr[4].put("StripOffsets", y55.e(0, this.g));
                mapArr[4].put("StripByteCounts", y55.e(this.l, this.g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", y55.b(0L, this.g));
                mapArr[4].put("JPEGInterchangeFormatLength", y55.b(this.l, this.g));
            }
        }
        int i3 = 0;
        while (true) {
            int length3 = z55VarArr.length;
            iArr = Q;
            if (i3 >= length3) {
                break;
            }
            Iterator it = mapArr[i3].entrySet().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                y55 y55Var = (y55) ((Map.Entry) it.next()).getValue();
                y55Var.getClass();
                int i5 = iArr[y55Var.a] * y55Var.b;
                if (i5 > 4) {
                    i4 += i5;
                }
            }
            iArr3[i3] = iArr3[i3] + i4;
            i3++;
        }
        int size = 8;
        for (int i6 = 0; i6 < z55VarArr.length; i6++) {
            if (!mapArr[i6].isEmpty()) {
                iArr2[i6] = size;
                size = (mapArr[i6].size() * 12) + 6 + iArr3[i6] + size;
            }
        }
        if (this.h) {
            if (this.i) {
                mapArr[4].put("StripOffsets", y55.e(size, this.g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", y55.b(size, this.g));
            }
            this.k = size;
            size += this.l;
        }
        if (this.d == 4) {
            size += 8;
        }
        if (t) {
            for (int i7 = 0; i7 < z55VarArr.length; i7++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i7), Integer.valueOf(iArr2[i7]), Integer.valueOf(mapArr[i7].size()), Integer.valueOf(iArr3[i7]), Integer.valueOf(size));
            }
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(z55VarArr2[1].b, y55.b(iArr2[1], this.g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(z55VarArr2[2].b, y55.b(iArr2[2], this.g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(z55VarArr2[3].b, y55.b(iArr2[3], this.g));
        }
        int i8 = this.d;
        if (i8 == 4) {
            uv0Var.g((short) size);
            uv0Var.write(a0);
        } else if (i8 == 13) {
            uv0Var.d(size);
            uv0Var.write(D);
        } else if (i8 == 14) {
            uv0Var.write(I);
            uv0Var.d(size);
        }
        uv0Var.g(this.g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        uv0Var.c = this.g;
        uv0Var.g((short) 42);
        uv0Var.d((int) 8);
        for (int i9 = 0; i9 < z55VarArr.length; i9++) {
            if (!mapArr[i9].isEmpty()) {
                uv0Var.g((short) mapArr[i9].size());
                int size2 = (mapArr[i9].size() * 12) + iArr2[i9] + 2 + 4;
                for (Map.Entry entry2 : mapArr[i9].entrySet()) {
                    int i10 = ((z55) W[i9].get(entry2.getKey())).a;
                    y55 y55Var2 = (y55) entry2.getValue();
                    y55Var2.getClass();
                    int i11 = y55Var2.a;
                    int i12 = iArr[i11];
                    int i13 = y55Var2.b;
                    int i14 = i12 * i13;
                    uv0Var.g((short) i10);
                    uv0Var.g((short) i11);
                    uv0Var.d(i13);
                    if (i14 > 4) {
                        uv0Var.d(size2);
                        size2 += i14;
                    } else {
                        uv0Var.write(y55Var2.d);
                        if (i14 < 4) {
                            while (i14 < 4) {
                                uv0Var.a(0);
                                i14++;
                            }
                        }
                    }
                }
                if (i9 != 0 || mapArr[4].isEmpty()) {
                    uv0Var.d((int) 0);
                } else {
                    uv0Var.d(iArr2[4]);
                }
                Iterator it2 = mapArr[i9].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((y55) ((Map.Entry) it2.next()).getValue()).d;
                    if (bArr.length > 4) {
                        uv0Var.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.h) {
            uv0Var.write(o());
        }
        if (this.d == 14 && size % 2 == 1) {
            uv0Var.a(0);
        }
        uv0Var.c = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strD = d("DateTimeOriginal");
        HashMap[] mapArr = this.e;
        if (strD != null && d("DateTime") == null) {
            mapArr[0].put("DateTime", y55.a(strD));
        }
        if (d("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", y55.b(0L, this.g));
        }
        if (d("ImageLength") == null) {
            mapArr[0].put("ImageLength", y55.b(0L, this.g));
        }
        if (d("Orientation") == null) {
            mapArr[0].put("Orientation", y55.b(0L, this.g));
        }
        if (d("LightSource") == null) {
            mapArr[1].put("LightSource", y55.b(0L, this.g));
        }
    }

    public final String d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        y55 y55VarF = f(str);
        if (y55VarF != null) {
            if (!X.contains(str)) {
                return y55VarF.i(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = y55VarF.a;
                if (i != 5 && i != 10) {
                    return null;
                }
                a65[] a65VarArr = (a65[]) y55VarF.j(this.g);
                if (a65VarArr == null || a65VarArr.length != 3) {
                    Arrays.toString(a65VarArr);
                    return null;
                }
                a65 a65Var = a65VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (a65Var.a / a65Var.b));
                a65 a65Var2 = a65VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (a65Var2.a / a65Var2.b));
                a65 a65Var3 = a65VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (a65Var3.a / a65Var3.b)));
            }
            try {
                return Double.toString(y55VarF.g(this.g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int e(int i, String str) {
        y55 y55VarF = f(str);
        if (y55VarF == null) {
            return i;
        }
        try {
            return y55VarF.h(this.g);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final y55 f(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < T.length; i++) {
            y55 y55Var = (y55) this.e[i].get(str);
            if (y55Var != null) {
                return y55Var;
            }
        }
        return null;
    }

    public final void g(b65 b65Var) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                e65.a(mediaMetadataRetriever, new w55(b65Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", y55.e(Integer.parseInt(strExtractMetadata), this.g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", y55.e(Integer.parseInt(strExtractMetadata2), this.g));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", y55.e(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    b65Var.d(i2);
                    byte[] bArr = new byte[6];
                    if (b65Var.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, a0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (b65Var.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.o = i4;
                    x(0, bArr2);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0154, code lost:
    
        r23.b = r22.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0158, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0141 A[LOOP:0: B:10:0x0023->B:82:0x0141, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.x55 r23, int r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.h(x55, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.i(java.io.BufferedInputStream):int");
    }

    public final void j(b65 b65Var) throws IOException {
        int i;
        int i2;
        m(b65Var);
        HashMap[] mapArr = this.e;
        y55 y55Var = (y55) mapArr[1].get("MakerNote");
        if (y55Var != null) {
            b65 b65Var2 = new b65(y55Var.d);
            b65Var2.b = this.g;
            byte[] bArr = A;
            byte[] bArr2 = new byte[bArr.length];
            b65Var2.readFully(bArr2);
            b65Var2.d(0L);
            byte[] bArr3 = B;
            byte[] bArr4 = new byte[bArr3.length];
            b65Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                b65Var2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                b65Var2.d(12L);
            }
            y(b65Var2, 6);
            y55 y55Var2 = (y55) mapArr[7].get("PreviewImageStart");
            y55 y55Var3 = (y55) mapArr[7].get("PreviewImageLength");
            if (y55Var2 != null && y55Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", y55Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", y55Var3);
            }
            y55 y55Var4 = (y55) mapArr[8].get("AspectFrame");
            if (y55Var4 != null) {
                int[] iArr = (int[]) y55Var4.j(this.g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                y55 y55VarE = y55.e(i5, this.g);
                y55 y55VarE2 = y55.e(i6, this.g);
                mapArr[0].put("ImageWidth", y55VarE);
                mapArr[0].put("ImageLength", y55VarE2);
            }
        }
    }

    public final void k(x55 x55Var) throws IOException {
        if (t) {
            Objects.toString(x55Var);
        }
        x55Var.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = C;
        x55Var.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = x55Var.readInt();
                byte[] bArr2 = new byte[4];
                if (x55Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, E)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, F)) {
                    return;
                }
                if (Arrays.equals(bArr2, D)) {
                    byte[] bArr3 = new byte[i];
                    if (x55Var.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + br7.h(bArr2));
                    }
                    int i3 = x55Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.o = i2;
                        x(0, bArr3);
                        J();
                        G(new x55(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                x55Var.a(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void l(x55 x55Var) throws IOException {
        if (t) {
            Objects.toString(x55Var);
        }
        x55Var.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        x55Var.read(bArr);
        x55Var.read(bArr2);
        x55Var.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        x55Var.a(i - x55Var.c);
        x55Var.read(bArr4);
        h(new x55(bArr4), i, 5);
        x55Var.a(i3 - x55Var.c);
        x55Var.b = ByteOrder.BIG_ENDIAN;
        int i4 = x55Var.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = x55Var.readUnsignedShort();
            int unsignedShort2 = x55Var.readUnsignedShort();
            if (unsignedShort == S.a) {
                short s = x55Var.readShort();
                short s2 = x55Var.readShort();
                y55 y55VarE = y55.e(s, this.g);
                y55 y55VarE2 = y55.e(s2, this.g);
                HashMap[] mapArr = this.e;
                mapArr[0].put("ImageLength", y55VarE);
                mapArr[0].put("ImageWidth", y55VarE2);
                return;
            }
            x55Var.a(unsignedShort2);
        }
    }

    public final void m(b65 b65Var) throws IOException {
        u(b65Var);
        y(b65Var, 0);
        I(b65Var, 0);
        I(b65Var, 5);
        I(b65Var, 4);
        J();
        if (this.d == 8) {
            HashMap[] mapArr = this.e;
            y55 y55Var = (y55) mapArr[1].get("MakerNote");
            if (y55Var != null) {
                b65 b65Var2 = new b65(y55Var.d);
                b65Var2.b = this.g;
                b65Var2.a(6);
                y(b65Var2, 9);
                y55 y55Var2 = (y55) mapArr[9].get("ColorSpace");
                if (y55Var2 != null) {
                    mapArr[1].put("ColorSpace", y55Var2);
                }
            }
        }
    }

    public final void n(b65 b65Var) throws IOException {
        if (t) {
            Objects.toString(b65Var);
        }
        m(b65Var);
        HashMap[] mapArr = this.e;
        y55 y55Var = (y55) mapArr[0].get("JpgFromRaw");
        if (y55Var != null) {
            h(new x55(y55Var.d), (int) y55Var.c, 5);
        }
        y55 y55Var2 = (y55) mapArr[0].get("ISO");
        y55 y55Var3 = (y55) mapArr[1].get("PhotographicSensitivity");
        if (y55Var2 == null || y55Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", y55Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] o() throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r8.h
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r8.m
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.content.res.AssetManager$AssetInputStream r0 = r8.c     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            if (r0 == 0) goto L26
            boolean r2 = r0.markSupported()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1f
            if (r2 == 0) goto L22
            r0.reset()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1f
        L18:
            r2 = r1
            goto L4d
        L1a:
            r8 = move-exception
            r2 = r1
        L1c:
            r1 = r0
            goto L8e
        L1f:
            r2 = r1
            goto L97
        L22:
            defpackage.br7.i(r0)
            return r1
        L26:
            java.lang.String r0 = r8.a     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            if (r0 == 0) goto L38
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            java.lang.String r2 = r8.a     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            goto L18
        L32:
            r8 = move-exception
            r2 = r1
            goto L8e
        L35:
            r0 = r1
            r2 = r0
            goto L97
        L38:
            java.io.FileDescriptor r0 = r8.b     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            java.io.FileDescriptor r0 = defpackage.d65.b(r0)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8b
            r3 = 0
            defpackage.d65.c(r0, r3, r2)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8b
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8b
            r7 = r2
            r2 = r0
            r0 = r7
        L4d:
            int r3 = r8.k     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            int r4 = r8.o     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            int r3 = r3 + r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            long r3 = r0.skip(r3)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            int r5 = r8.k     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            int r6 = r8.o     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            int r5 = r5 + r6
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r4 = "Corrupted image"
            if (r3 != 0) goto L82
            int r3 = r8.l     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            int r5 = r0.read(r3)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            int r6 = r8.l     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            if (r5 != r6) goto L7c
            r8.m = r3     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            defpackage.br7.i(r0)
            if (r2 == 0) goto L79
            defpackage.d65.a(r2)     // Catch: java.lang.Exception -> L79
        L79:
            return r3
        L7a:
            r8 = move-exception
            goto L1c
        L7c:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            throw r8     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
        L82:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
            throw r8     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L97
        L88:
            r8 = move-exception
            r2 = r0
            goto L8e
        L8b:
            r2 = r0
            r0 = r1
            goto L97
        L8e:
            defpackage.br7.i(r1)
            if (r2 == 0) goto L96
            defpackage.d65.a(r2)     // Catch: java.lang.Exception -> L96
        L96:
            throw r8
        L97:
            defpackage.br7.i(r0)
            if (r2 == 0) goto L9f
            defpackage.d65.a(r2)     // Catch: java.lang.Exception -> L9f
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.o():byte[]");
    }

    public final void p(x55 x55Var) throws IOException {
        if (t) {
            Objects.toString(x55Var);
        }
        x55Var.b = ByteOrder.LITTLE_ENDIAN;
        x55Var.a(G.length);
        int i = x55Var.readInt() + 8;
        byte[] bArr = H;
        x55Var.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (x55Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = x55Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(I, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (x55Var.read(bArr3) == i2) {
                        this.o = i3;
                        x(0, bArr3);
                        G(new x55(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + br7.h(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                x55Var.a(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void r(x55 x55Var, HashMap map) throws IOException {
        y55 y55Var = (y55) map.get("JPEGInterchangeFormat");
        y55 y55Var2 = (y55) map.get("JPEGInterchangeFormatLength");
        if (y55Var == null || y55Var2 == null) {
            return;
        }
        int iH = y55Var.h(this.g);
        int iH2 = y55Var2.h(this.g);
        if (this.d == 7) {
            iH += this.p;
        }
        if (iH <= 0 || iH2 <= 0) {
            return;
        }
        this.h = true;
        if (this.a == null && this.c == null && this.b == null) {
            byte[] bArr = new byte[iH2];
            x55Var.skip(iH);
            x55Var.read(bArr);
            this.m = bArr;
        }
        this.k = iH;
        this.l = iH2;
    }

    public final boolean s(HashMap map) {
        y55 y55Var = (y55) map.get("ImageLength");
        y55 y55Var2 = (y55) map.get("ImageWidth");
        if (y55Var == null || y55Var2 == null) {
            return false;
        }
        return y55Var.h(this.g) <= 512 && y55Var2.h(this.g) <= 512;
    }

    public final void t(InputStream inputStream) {
        boolean z2 = t;
        for (int i = 0; i < T.length; i++) {
            try {
                this.e[i] = new HashMap();
            } catch (IOException | UnsupportedOperationException unused) {
                a();
                if (!z2) {
                    return;
                }
            } catch (Throwable th) {
                a();
                if (z2) {
                    v();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int i2 = i(bufferedInputStream);
        this.d = i2;
        if (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) {
            x55 x55Var = new x55(bufferedInputStream);
            int i3 = this.d;
            if (i3 == 4) {
                h(x55Var, 0, 0);
            } else if (i3 == 13) {
                k(x55Var);
            } else if (i3 == 9) {
                l(x55Var);
            } else if (i3 == 14) {
                p(x55Var);
            }
        } else {
            b65 b65Var = new b65(bufferedInputStream);
            int i4 = this.d;
            if (i4 == 12) {
                g(b65Var);
            } else if (i4 == 7) {
                j(b65Var);
            } else if (i4 == 10) {
                n(b65Var);
            } else {
                m(b65Var);
            }
            b65Var.d(this.o);
            G(b65Var);
        }
        a();
        if (!z2) {
            return;
        }
        v();
    }

    public final void u(x55 x55Var) throws IOException {
        ByteOrder byteOrderW = w(x55Var);
        this.g = byteOrderW;
        x55Var.b = byteOrderW;
        int unsignedShort = x55Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = x55Var.readInt();
        if (i2 < 8) {
            throw new IOException(zr6.h(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            x55Var.a(i3);
        }
    }

    public final void v() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.e;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                y55 y55Var = (y55) entry.getValue();
                y55Var.toString();
                y55Var.i(this.g);
            }
            i++;
        }
    }

    public final void x(int i, byte[] bArr) throws IOException {
        b65 b65Var = new b65(bArr);
        u(b65Var);
        y(b65Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(defpackage.b65 r27, int r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c65.y(b65, int):void");
    }

    public final void z(String str) {
        for (int i = 0; i < T.length; i++) {
            this.e[i].remove(str);
        }
    }

    public c65(FileDescriptor fileDescriptor) throws Throwable {
        boolean z2;
        z55[][] z55VarArr = T;
        this.e = new HashMap[z55VarArr.length];
        this.f = new HashSet(z55VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            FileInputStream fileInputStream = null;
            this.c = null;
            this.a = null;
            try {
                d65.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                this.b = fileDescriptor;
                try {
                    fileDescriptor = d65.b(fileDescriptor);
                    z2 = true;
                } catch (Exception e) {
                    throw new IOException("Failed to duplicate file descriptor", e);
                }
            } catch (Exception unused) {
                this.b = null;
                z2 = false;
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileDescriptor);
                try {
                    t(fileInputStream2);
                    br7.i(fileInputStream2);
                    if (z2) {
                        try {
                            d65.a(fileDescriptor);
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    br7.i(fileInputStream);
                    if (z2) {
                        try {
                            d65.a(fileDescriptor);
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public c65(InputStream inputStream) throws IOException {
        z55[][] z55VarArr = T;
        this.e = new HashMap[z55VarArr.length];
        this.f = new HashSet(z55VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        this.a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                d65.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.c = null;
                this.b = fileInputStream.getFD();
            } catch (Exception unused) {
            }
        } else {
            this.c = null;
            this.b = null;
        }
        t(inputStream);
    }
}
