package com.roku.cloudgo.lib;

public enum ProductClass {
    衣服(1100),男装(1101),女装(1102),童装(1103),内衣(1104),其他衣服(1199), 鞋靴(1200),流行女鞋(1201),高跟鞋(1202),运动鞋(1203),增高鞋(1204),拖鞋(1205),其他鞋靴(1299), 家电(1300),电视(1301),空调(1302),洗衣机(1303),冰箱(1304),厨房电器(1305),其他家电(1399), 食品(1400),生鲜(1401),饮品(1402),零食(1403),其他食品(1499), 洗护(1500),洗发水(1501),牙膏(1502),肥皂(1503),洗衣液(1504),其他洗护用品(1599), 其他商品(9900), 其他(9999);

    private int index;
    ProductClass(int i) {
        this.index = i;
    }

    public static ProductClass valueOf(int index)
    {
        switch (index)
        {
            case 1100:
                return 衣服;
            case 1101:
                return 男装;
            case 1102:
                return 女装;
            case 1103:
                return 童装;
            case 1104:
                return 内衣;
            case 1199:
                return 其他衣服;
            case 1200:
                return 鞋靴;
            case 1201:
                return 流行女鞋;
            case 1202:
                return 高跟鞋;
            case 1203:
                return 运动鞋;
            case 1204:
                return 增高鞋;
            case 1205:
                return 拖鞋;
            case 1299:
                return 其他鞋靴;
            case 1300:
                return 家电;
            case 1301:
                return 电视;
            case 1302:
                return 空调;
            case 1303:
                return 洗衣机;
            case 1304:
                return 冰箱;
            case 1305:
                return 厨房电器;
            case 1399:
                return 其他家电;
            case 1400:
                return 食品;
            case 1401:
                return 生鲜;
            case 1402:
                return 饮品;
            case 1403:
                return 零食;
            case 1499:
                return 其他食品;
            case 1500:
                return 洗护;
            case 1501:
                return 洗发水;
            case 1502:
                return 牙膏;
            case 1503:
                return 肥皂;
            case 1504:
                return 洗衣液;
            case 1599:
                return 其他洗护用品;
            case 9900:
                return 其他商品;
            default:
                return 其他;
        }
    }

    public int getIndex() {
        return index;
    }
}
