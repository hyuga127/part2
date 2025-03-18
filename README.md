## docker --version: Xem phiên bản hiện tại của docker
![image](https://github.com/user-attachments/assets/c4765214-908c-43b4-b434-4326e0336776)
## docker run hello-world:
Docker kiểm tra xem image hello-world đã có trên máy chưa.
Nếu chưa có, Docker sẽ tải image hello-world từ Docker Hub.
Sau đó, Docker tạo một container từ image này và chạy nó.
Container chạy một chương trình in ra màn hình dòng chữ chào mừng cùng với một số thông tin về cách Docker hoạt động.
Sau khi in xong, container tự thoát.
![image](https://github.com/user-attachments/assets/23ca397e-d548-4af3-ad64-953e0d597c37)
##  docker pull nginx: Lệnh này tải (pull) image nginx từ Docker Hub về máy mà không chạy nó.
Docker tìm image nginx trên Docker Hub (nginx trên Docker Hub).
Nếu có sẵn trên máy, Docker kiểm tra phiên bản mới nhất.
Nếu chưa có hoặc có phiên bản cũ, Docker tải về image mới nhất.
![image](https://github.com/user-attachments/assets/368a6192-505e-456e-a728-9ab34a9d5d2b)
## docker images: Lệnh này liệt kê tất cả các images đang có trên máy Docker của bạn.
![image](https://github.com/user-attachments/assets/5da73b3b-0726-4b8f-9620-df0240b0cfc6)
## docker run -d nginx: Lệnh này chạy container từ image nginx ở chế độ nền (detached mode).
![image](https://github.com/user-attachments/assets/c0c11e74-65c0-4866-9762-f98d45a169ae)
## docker ps: Liệt kê tất cả các container đang chạy trên Docker.
![image](https://github.com/user-attachments/assets/aeea4591-e629-4ea9-8032-cdd39bcfa4c2)
## docker ps -a: Liệt kê tất cả các container trên hệ thống, bao gồm cả những container đang chạy và đã dừng.
![image](https://github.com/user-attachments/assets/07bba924-b86a-4226-94f0-90522f44f015)
## docker logs <container_id>: Lệnh này xem log của một container để kiểm tra hoạt động và debug lỗi.
![image](https://github.com/user-attachments/assets/223f0bb5-2813-4eb0-a71a-1e098f20bda5)
## docker rmi <image_id>: Lệnh này xóa một image khỏi hệ thống Docker (Phải dừng image đang chạy thì mới xóa được).
![image](https://github.com/user-attachments/assets/09345168-6931-44f3-8341-536e8575303a)
## docker image prune -a: Lệnh này xóa tất cả các image không còn được sử dụng (không có container nào đang dùng).
![image](https://github.com/user-attachments/assets/53450571-1e87-483f-84e9-663a5124721f)
## docker run -d -p 8080:80 nginx: Chạy một container Nginx trong chế độ nền (detached mode) và ánh xạ cổng 8080 của máy host vào cổng 80 của container.
![image](https://github.com/user-attachments/assets/0da8b886-6541-4f0b-b521-5a8e91c544f2)
## docker inspect <container_id>: Lệnh này hiển thị thông tin chi tiết về container, bao gồm:
Trạng thái (đang chạy hay đã dừng). Cấu hình mạng (IP, cổng). Volume được mount. Lệnh khởi động container. Image được sử dụng.
![image](https://github.com/user-attachments/assets/742f13e3-4c95-4258-b0a8-5a31d6dbbbfe)
## docker run -d -v mydata:/data nginx: Lệnh này chạy một container Nginx trong nền (detached mode) và gắn volume tên mydata vào thư mục /data trong container.
![image](https://github.com/user-attachments/assets/ba495acc-ab60-4155-89fe-9b5137ebe487)
## docker volume ls: Liệt kê tất cả các Docker volumes đang có trên hệ thống.
![image](https://github.com/user-attachments/assets/f99452f2-b2f4-4021-8909-00b474146faa)
## docker volume prune: Lệnh này xóa tất cả các volumes không còn được sử dụng bởi bất kỳ container nào (dangling volumes), giúp giải phóng dung lượng ổ đĩa.
![image](https://github.com/user-attachments/assets/187b1b47-1ddc-476e-a6ec-ac7f269a4f0a)
## docker run -d --name my_nginx nginx: Lệnh này sẽ tạo và chạy một container Nginx ở chế độ nền (detached mode) với tên là my_nginx.
![image](https://github.com/user-attachments/assets/51d30988-2430-4d72-878d-dadd20cf3510)
## docker stats: Hiển thị thống kê tài nguyên hệ thống (CPU, RAM, mạng, I/O đĩa) của các container đang chạy theo thời gian thực.
![image](https://github.com/user-attachments/assets/24f24b19-842b-4d6f-b15f-4521d48b600c)
## docker network ls: Hiển thị danh sách các mạng (networks) trong Docker, bao gồm mạng mặc định và mạng do người dùng tạo.
![image](https://github.com/user-attachments/assets/c2328735-9956-4244-b7c8-27b72d6471d8)
## docker network create my_network: Lệnh này tạo một mạng Docker mới có tên là my_network.
![image](https://github.com/user-attachments/assets/af0bc6eb-49a8-40d9-bb73-2a86772193d9)
## docker run -d --network my_network --name my_container nginx: hạy một container mới có tên my_container, sử dụng mạng Docker tùy chỉnh my_network, chạy nền với hình ảnh nginx.
![image](https://github.com/user-attachments/assets/444f0e41-201e-4c85-907c-d4e8ee809ef9)
## docker network connect my_network my_nginx: kết nối container my_nginx vào mạng my_network.
![image](https://github.com/user-attachments/assets/ec95ce0e-f529-4e04-99ec-0f4d3fb74485)
## docker run -d -e MY_ENV=hello_world nginx: chạy một container từ image nginx ở chế độ nền (-d), đồng thời thiết lập biến môi trường MY_ENV với giá trị hello_world.
![image](https://github.com/user-attachments/assets/5e9b545c-9fd1-49b1-9705-d3b906e1465b)
## docker logs -f my_nginx: hiển thị log (nhật ký hoạt động) của container my_nginx và theo dõi log theo thời gian thực.
![image](https://github.com/user-attachments/assets/a3e71291-3278-4ed0-9f40-69b81729772e)
## FROM nginx: khai báo image gốc (base image) là nginx trong Dockerfile.
## COPY index.html /usr/share/nginx/html/index.html :  sao chép file index.html từ thư mục build vào container trong đường dẫn /usr/share/nginx/html/index.html. Đây là thư mục mặc định chứa file HTML của Nginx.
## docker build -t my_nginx_image .: build một Docker image từ Dockerfile trong thư mục hiện tại (.) và đặt tên cho nó là my_nginx_image.
![image](https://github.com/user-attachments/assets/285db0d6-55cd-4911-b07e-586b5795d628)

