package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload2.core.DiskFileItem;
import org.apache.commons.fileupload2.core.DiskFileItemFactory;
import org.apache.commons.fileupload2.core.FileItem;
import org.apache.commons.fileupload2.core.FileItemFactory;
import org.apache.commons.fileupload2.jakarta.JakartaServletDiskFileUpload;

import java.io.IOException;
import java.util.List;

@WebServlet("/file/upload")
public class FileUploadServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JakartaServletDiskFileUpload upload = new JakartaServletDiskFileUpload();
        // parseRequest(...) : 요청 데이터 중에서 multipart를 양식과 파일 데이터

        List<DiskFileItem> items = upload.parseRequest(req);
        for (FileItem item : items) {
            String name = item.getFieldName();
            if (item.isFormField()) { // 일반 양식 데이터
                String value = item.getString();
                System.out.printf("일반 양식: %s, %s%n", name, value);
            } else { // 파일 데이터
                System.out.printf("파일 : %s%n", name);
            }
        }

    }
}
