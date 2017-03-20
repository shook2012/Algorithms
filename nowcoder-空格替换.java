/*
请实现一个函数，将一个字符串中的空格替换成“%20”。
例如，当字符串为We Are Happy.
则经过替换之后的字符串为We%20Are%20Happy。
*/

/*
思路1：正常思路就是从头开始，将数据放到一个新的字符串
思路2：从前往后替换，后面的字符要不断往后移动，要多次移动，所以效率低下
      从后往前，先计算需要多少空间，然后从后往前移动，则每个字符只为移动一次，这样效率更高一点。（下次用这个）
思路3：利用string的函数，一行解决：return str.toString().replaceAll("\\s", "%20");
*/
public class Solution {
    public String replaceSpace(StringBuffer str) {
    	StringBuffer out =new StringBuffer();     //新建一个stringbuffer
        for(int i=0;i<str.length();i++){           //从头开始
            char b=str.charAt(i);                  //取得第I个元素
            if(String.valueOf(b).equals(" ")){      //equals和==是有区别的
                                                    //valueOf是Integer类的一个静态方法，
                                                    //它是把一个string参数转换为Integer类型
                                                    //那么经过Integer.valueOf（"345"）转换，345就是一个Integer类型了  
                out.append("%20");
            }
            else
                out.append(b);
        }
        return out.toString();                      //最后把stringbuffer换为string
    }

}